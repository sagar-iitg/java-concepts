# Java


<a href="http://www.angelikalanger.com/GenericsFAQ/FAQSections/TechnicalDetails.html#FAQ106" target="_blank">Technicalities - Under The Hood Of The Compiler</a>

Basics


| TYPE | DESCRIPTION | DEFAULT | SIZE | EXAMPLE LITERAL | RANGE OF VALUES |
|---------|---------------|-------|------ |------------------------------|------------------------|
| boolean | true or false | false | 1 bit   | true, false | true, false |
| byte | twos compleement integer  | 8 bits | none  | -128 to 127 |
|char | unicode character| \u0000 | 16 bits | 'a', '\u0041', '\101', "\\", '\', '\n'| character representation of ASCII values 0 to 255 |
| short | twos complement inteegr | 0 | 16 bits | none | -32768, 32767|
| int | twos complement integer | 0 | 32 bits| -1,0, 1| -2147483648, 2147483647 |
| long | twos complement integer | 0 | 64 bits | -2L,-1l,0L,1L,2l | -9223372036854775808, 9223372036854775807|
| float | IEEE 754 floating point | 0.0 | 32 bits | 1.23e100f, -1.23e100f,.3f,3.14f | upto 7 decimal digits |
| double | IEEE 754 floating point | 0.0 | 64 bits | 1.23456e009d, 1e1d | upto 16 decimal points |


## FLOWCHARTS
Diagram to represent solutions to problem

Receipe of Tea
1. start
2. bowl with water
3. gas stove on
4. sugar,tea leaves, mils
5. boil
6. exit

Flow Chart:
input/print/display/output  --> parallelogram
processblock-Rectangle ()


PseudoCode

------
if/ else
Decison making block
--------------

Prime number:
divisble by one and by number itself
(2,n-1) must be one divisor-> Non prime

--------------

a%b--->modulo/remainder

-----------------
Exit from program is (return) keyword in program


-----------------------

semicolon ; --> statement terminator
-------------

println--->ln stands for nextline.

need to declare data type like int,float,boolean,
strict language--> safe

--------------

Type Conversion

a. type compatible
b. destination type> source type


byte-> short->int-> float->long-> double

Type casting
narrowing conversion

--------
Type Promotion in Expression

1. Java Automatically promotes each byte, short, or char operand to int when evaluating an expression.
2. If one operand is long, float, or double the whole expression is promoted to long, float or double respectively.

Type Promotion only works with expression.
-------------

Types Of operators

Arithmetic Operators(Unary/ binary)
Relational Operators
Logical operators
Bitwise Operators (Bit Manipulation)
Assignent Operators

----------------
Unary Operator

PreIncrement
++a
1. value change
2. value use

PostIncrement
a++
1. value use
2. value change


-----------------

Relational Operator
returns true and false



== equal
!= not equal
>
<
>=
<=


Logical Operator

&& Logical AND
|| Logical OR
! Logical Not


-----------------
Assignment Operators


=
+=
-=
*=
/=
--------------------------


returnType name(type param1,type param2){
//body
return statement;

}

1. formal arguments
2. actual arguments

-----------------
formal params
params
definition
-------------

---------------
actual params
arguments
call
--------------


Java always call by value

---
Methods

User Defined
Inbuilt Methods


Math Class
Math.pow()
Math.sqrt()
Math.max()


------------
Function Overloading
----------------
Type of params
no of params

--------------doesn't depend on return type-------------


Using Data Types





















