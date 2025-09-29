# Java Sockets 
A hands-on journey into **Java socket programming and concurrency**.  
This repository starts with simple echo servers and will expand gradually into more advanced projects as I continue learning.

---

## ✅ Current Milestones

### 01  Single-Thread Echo
- Server handles **one client at a time** using blocking I/O.
- Client sends a message → server echoes it back.
- Shows the fundamentals: sockets, streams, and resource cleanup.

### 02  Multi-Thread Echo
- Server handles **multiple clients concurrently** using a fixed thread pool.
- Each client runs in its own worker thread.
- Shows concurrency basics, thread-pool usage, and graceful shutdown.

---

## 🚀 Direction of Growth
This repo is a **progressive notebook of learning**.  
Future additions may include more advanced concurrency models, chat servers, or protocol-based projects: added step by step as I grow.  
The exact roadmap is intentionally open-ended.

---

## 📂 Repository Layout
java-sockets-from-zero-to-pro/
01-single-thread-echo/
02-multi-thread-echo/
.vscode/
.gitignore
README.md


---

## ▶️ Running in VS Code
1. Open this repo in VS Code with the Java extensions installed.  
2. Run the server (`ServerMain.java`).  
3. Run the client (`ClientMain.java` or `MultiClientMain.java`).  
4. Messages typed by the client are echoed back by the server.  

👉 For details, see the `README.md` inside each milestone folder.

---

## ✨ Why This Repo Exists
- To practice backend fundamentals (networking + concurrency).  
- To show **progression**: each milestone builds on the last.  
- To build professional habits (clean code, resource management, documentation).  

---

## 📜 License
MIT (see `LICENSE`).
