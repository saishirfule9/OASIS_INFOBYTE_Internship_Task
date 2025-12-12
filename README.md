# Online Reservation System  
This project is part of my Oasis Infobyte internship tasks.  
It is a simple demonstration of an online reservation system built using a React frontend and a Java Spring Boot backend.

The main idea of this project is to show how a reservation form works, how data is collected from the user, and how it is sent to a backend API.  
The backend stores the reservation records in memory and exposes endpoints to add and view reservations.

---

## Features
### Frontend (React)
- Simple reservation form  
- Input fields for passenger name, email, train number, class type, travel date, from place, to place  
- Form validation for required fields  
- Sends data to backend using fetch API  
- Displays success or failure message  

### Backend (Spring Boot)
- REST endpoints for creating and viewing reservations  
- In memory storage for reservation records  
- CORS enabled for communication with React  
- Clean and simple controller and model setup  

---

## Project Structure

01_Online_Reservation_System/
│
├── frontend/ # React application (Vite)
│ ├── src/
│ ├── index.html
│ └── package.json
│
├── backend/ # Spring Boot application
│ ├── src/main/java/com/reservation/api/
│ ├── src/main/resources/
│ └── pom.xml
│
├── sql/ # Sample DB schema (optional)
│ └── reservation_tables.sql
│
└── docs/ # Instructions and screenshots
└── instructions.md


---

## How to Run

### Backend
1. Open terminal and navigate to `backend/`
2. Run:

3. Backend runs at `http://localhost:8080`

### Frontend
1. Open terminal and navigate to `frontend/`
2. Install dependencies:


3. Start development server:


4. Frontend runs at `http://localhost:5173`

---


## API Endpoints

- **Create Reservation**


- **Get All Reservations**


---

## Technologies Used

**Frontend:** React, Vite, JavaScript, CSS  
**Backend:** Java, Spring Boot, Maven  

---

## Author

**Sainath Shirfule**  
Backend Java Developer  
GitHub: [github.com/saishirfule9](https://github.com/saishirfule9)  
Email: saishirfule9@gmail.com

---

## Notes

- This project is part of **Oasis Infobyte Internship Task 01**.  
- It demonstrates a full-stack application with React frontend and Java backend.  
- Screenshots and additional instructions are available in the `docs/` folder.



