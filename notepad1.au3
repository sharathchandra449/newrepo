Run("notepad.exe")
WinWaitActive("Untitled - Notepad")

ControlSend("Untitled - Notepad","","Edit1","Hi, How are you?")

WinClose("Untitled - Notepad")

WinWaitActive("Notepad")

ControlClick("Notepad","","Button1")

WinWaitActive("Save As")
WinWaitActive("Save As")
ControlSend("Save As","","Edit1","F:\online.txt")

ControlClick("Save As","","Button1")