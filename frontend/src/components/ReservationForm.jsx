import { useState } from "react";

export default function ReservationForm() {
  const [form, setForm] = useState({
    name: "",
    email: "",
    train_number: "",
    travel_date: "",
    class_type: "",
    from_place: "",
    to_place: ""
  });

  const [message, setMessage] = useState("");

  function onChange(e) {
    setForm({ ...form, [e.target.name]: e.target.value });
  }

  async function onSubmit(e) {
    e.preventDefault();
    setMessage("Saving...");
    try {
      const res = await fetch("http://localhost:8080/api/reservations", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(form)
      });
      if (!res.ok) throw new Error("Network response not ok");
      const data = await res.json();
      setMessage("Reservation saved. ID: " + data.id);
      setForm({
        name: "",
        email: "",
        train_number: "",
        travel_date: "",
        class_type: "",
        from_place: "",
        to_place: ""
      });
    } catch (err) {
      console.error(err);
      setMessage("Failed to save reservation");
    }
  }

  return (
    <div style={{ maxWidth: 680 }}>
      <form onSubmit={onSubmit}>
        <div>
          <label>Name</label><br/>
          <input name="name" value={form.name} onChange={onChange} required />
        </div>

        <div>
          <label>Email</label><br/>
          <input name="email" value={form.email} onChange={onChange} />
        </div>

        <div>
          <label>Train Number</label><br/>
          <input name="train_number" value={form.train_number} onChange={onChange} />
        </div>

        <div>
          <label>Travel Date</label><br/>
          <input type="date" name="travel_date" value={form.travel_date} onChange={onChange} />
        </div>

        <div>
          <label>Class Type</label><br/>
          <select name="class_type" value={form.class_type} onChange={onChange}>
            <option value="">Select</option>
            <option value="Sleeper">Sleeper</option>
            <option value="AC">AC</option>
            <option value="First Class">First Class</option>
          </select>
        </div>

        <div>
          <label>From</label><br/>
          <input name="from_place" value={form.from_place} onChange={onChange} />
        </div>

        <div>
          <label>To</label><br/>
          <input name="to_place" value={form.to_place} onChange={onChange} />
        </div>

        <div style={{ marginTop: 10 }}>
          <button type="submit">Save Reservation</button>
        </div>
      </form>

      <p>{message}</p>
    </div>
  );
}
