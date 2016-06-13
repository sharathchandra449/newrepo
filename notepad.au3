Run("notepad.exe")
WinWaitActive("Untitled - Notepad")
Send("Hi, Welcome to the selenium world. You are learning selenium which is a functional automation testing tool")
WinClose("Untitled - Notepad")

WinWaitActive("Notepad")
Send("{ENTER}")

WinWaitActive("Save As")
Send("E:\sample123.txt")
Send("{ENTER}")