# DSA Organizer (CLI)
![Java](https://img.shields.io/badge/Java-17-orange)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![License](https://img.shields.io/badge/License-MIT-blue)

A Core Java command-line application to organize, search, analyze, and export Data Structures & Algorithms (DSA) problems.

---

## 📖 About

DSA Organizer is a Core Java project that automatically scans a folder containing Java DSA solutions, extracts problem metadata, and organizes all problems in one place.

The application allows users to search problems by difficulty or algorithm, view statistics, and export the entire collection to a CSV report.

I built this project to strengthen my Core Java and Object-Oriented Programming skills while solving a real-world problem of managing my growing collection of DSA solutions.

---

## ✨ Features

- Scan DSA solution folders automatically
- Read metadata from Java solution files
- Display all problems in a formatted table
- Search by Difficulty
- Search by Algorithm
- View topic-wise statistics
- View overall DSA statistics
- Export problems to CSV
- Menu-driven Command Line Interface

---

## 🏗️ Project Structure

```text
DSA-Organizer-CLI
│
├── src
│   └── organiser
│       ├── model
│       │     └── Problem.java
│       │
│       ├── scanner
│       │     └── FolderScanner.java
│       │
│       ├── reader
│       │     └── MetadataReader.java
│       │
│       ├── service
│       │     └── ProblemService.java
│       │
│       ├── exporter
│       │     └── CsvExporter.java
│       │
│       ├── menu
│       │     └── Menu.java
│       │
│       └── Main.java
│
├── DSA
│    ├── Arrays
│    ├── Strings
│    └── ...
│
├── README.md
└── .gitignore
```
---

## 📐 Application Architecture

```text
                Main
                  │
                  ▼
          FolderScanner
                  │
                  ▼
         MetadataReader
                  │
                  ▼
          ProblemService
            │         │
            ▼         ▼
          Menu   CsvExporter
```
### Responsibilities

| Class | Responsibility |
|-------|----------------|
| Main | Starts the application and wires all components together |
| FolderScanner | Scans the DSA folder for Java solution files |
| MetadataReader | Reads metadata from each solution file |
| Problem | Stores metadata for a single problem |
| ProblemService | Handles searching, statistics, and business logic |
| CsvExporter | Exports problem data to a CSV file |
| Menu | Provides the command-line interface |

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections Framework
- File I/O
- Exception Handling
- CSV Export
- IntelliJ IDEA

---

## ⚙️ How It Works

1. The application scans the `DSA` folder.
2. Each Java file is read using `MetadataReader`.
3. Metadata is stored as `Problem` objects.
4. All problems are managed by `ProblemService`.
5. Users interact with the application through the command-line menu.
6. Data can be searched, analyzed, or exported to a CSV report.

---

## ▶️ How to Run

### Prerequisites

- Java 17 or later
- IntelliJ IDEA (or any Java IDE)

### Steps

1. Clone this repository.
2. Open the project in IntelliJ IDEA.
3. Place your DSA solution files inside the `DSA` folder.
4. Run `Main.java`.
5. Use the menu to browse, search, analyze, or export your DSA problems.

---

## 🔮 Future Improvements

- Mark problems as Solved / Unsolved
- Track revision history
- Store data using SQLite or JSON
- Open Java solution files directly from the application
- Launch LeetCode and Codeforces problem links
- Monthly and yearly progress tracking
- Codeforces integration
- LeetCode synchronization
- Spring Boot REST API
- Web dashboard with analytics

---

## 📚 What I Learned

Through this project, I gained hands-on experience with:

- Core Java
- Object-Oriented Programming (OOP)
- Java Collections Framework
- File Handling
- Exception Handling
- Constructor Injection
- Clean Project Architecture
- Separation of Concerns
- CSV File Generation
- Command-Line Application Design

---

## 👨‍💻 Author

**Priyanshu Gamit**

Second-Year Computer Science Engineering Student

This project was built as part of my journey to master Core Java before moving on to Spring Boot and Full-Stack Java Development.