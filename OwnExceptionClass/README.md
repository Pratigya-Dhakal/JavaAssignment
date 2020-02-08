#Own Exception
It is possible to  design our own exception as per the application requirement.This is possible in java.
>Points
-All exception must be a child of throwable.
-If we want to write a checked Exception that is automatically enforced by the Handel,We need to extend the exception class.
-If we want to write a runtime exception,we need to extend the Runtime Exception class.
-We can define our own Excepton class as below:
				``class MyException extends Exception{}``
