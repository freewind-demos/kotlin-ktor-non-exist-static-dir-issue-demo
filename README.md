Kotlin Ktor Serve Non-Existent Static Files Issue Demo
======================================================

Use [ktor](http://ktor.io) to serve static files, but with non-existent dir.
To test the behaviour of ktor.

Run `Hello.kt` in your IDE, and open <http://localhost:8080> in your browser.

I think in this case, server should respond `500` and show some error in the log,
but it responds `404`, and no error reported.
