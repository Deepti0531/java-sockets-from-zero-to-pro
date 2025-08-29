# 02 — Multi-Threaded Echo Server (Thread Pool)

**Goal:** Extend the single-thread server to support **multiple clients concurrently**.  
The server uses a **fixed thread pool** so it can scale without creating unlimited threads.  
Each client gets its own worker thread to handle communication.

---

## How to Run (in VS Code)
1. Run `ServerMain.java`
2. Run `MultiClientMain.java 10`  → spawns 10 clients that connect simultaneously

---

## Key Learning
- Thread-per-connection vs thread pools
- Controlled concurrency with `Executors.newFixedThreadPool`
- Graceful shutdown hooks for cleanup
