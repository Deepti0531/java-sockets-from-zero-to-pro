# 01 — Single-Thread Echo Server

**Goal:** Learn the absolute basics of socket programming.  
The server handles **one client at a time** using blocking I/O.  
The client sends a single line → the server echoes it back.

---

## How to Run (in VS Code)
1. Run `ServerMain.java`
2. Run `ClientMain.java "Hello Server"`

---

## Key Learning
- Opening sockets (`ServerSocket` / `Socket`)
- Blocking I/O with `BufferedReader` + `PrintWriter`
- Resource cleanup using try-with-resources
