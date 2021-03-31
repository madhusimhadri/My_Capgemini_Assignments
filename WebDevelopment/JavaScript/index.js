console.log("Hello from JavaScript");
//inline comment
/*Multiline comment*/
//data types:   undefined,null,boolean,string,symbol,number and object
/*Declaring a variable
var myName="Madhu"  ...throughtout the program
let ourName="Capgemini"   ...used only in the scope where it is declared
const pi=3.14 ...cannot be changed */

/*
console.log() ...allows us to see things in console.
*/

/*Assignment Operators
var a=9;
*/

/*CASE SeENSITIVITY
variable names and function names are case sensitive
*/

/* 
ADDING TWO NUMBERS
var sum=10+10;
console.log(sum)
SUBTRACT
var diff=40-12;
Multiply
var mul=10*8;
Divide
var quotient=44/22;
Increment
var a=80;
a++;
Decrement
a--
Remainder
var a=100%5;

Augmented operation
a+=5;
a-=5;
a*=5;
a/=5;
a%=5;

*/

/*
Declaring a String variable
var firstname="madhu"
var lastname="my\" name\" is\" madhu"
A stringcan be enclosed in a single quotes or double quotes
*/

/*
Escape characters
\' single quote
\\" double quote
\\ backslash
\n newline
\r carriage return
\b backspace
\t tab
\f form feed
*/

/*
Concatinating using + operators
var name="madhu"+"simhadri"
+= can also be used to concatenate
*/

/*Length of a String
var firstnamelength=0;
var firstname="madhu";
firstnamelength=firstname.length;
*/

/*bracket notation
firstnameletter=firstname[0];

To find nth character in a string
var firstname="madhu";
var lastletteroffirstname=firstname[firstname.length-1];
*/

/*String Immutability-Cannot be altered individual characters
var mystr="jello world";
mystr[0]="h";//error cannot be changed like this
mystr="hello world";

*/

/*
Word Blanks

*/

/*Modifying arrays with indexes
var a1=[1,2,3]
var a1[0]=100;can be done
*/

/*Using push to append an array
var myarray=["madhu","hs","bhaggu"]
myarray.push(["sruthi","sri"])
*/

/*Removing an item in an array using pop
var myarray=[1,3,2]
var removed=myarray.pop() ...removes last element
*/

/*Manipulating arrays with shift function
var myarray=[1,3,2]
var removed=myarray.shift() ...removes first element
*/

/*
Manipulating arrays with unshift function
var myarray=[1,3,2]
var add=myarray.unshift("22") ...adds element at the beginning
*/

/*Function

function myFunction()
{
    console.log("Hello World");
}
myFunction();
*/

/*
== equality operator
3=='3' true
=== strict equality operator(won't do type conversion)
3==='3' false
*/

/*Objects 
Contains key value pairs
Instead of referring using indexes as we do in arrays we refer using properties
 we can access the properties by dot notaion.
 we can use bracket notation also to access the properties but we use this when we have space in the property name.
 Name= testobj["my name"];
 we can use variables to access the properties.
 To update property
 objectname.propertyname="updated value"
 To add new property
 using dot notation
 objectname.newpropertyname="value of the new property"
 using bracket
 objectname['propertyname']="value name"
 
 Delete properties from an object
 delete objectname.propertyname
 
 We can also use objects for lookup values
 
 To check whether an object has a property
 hasOwnProperty
 
 An object can store stringd,arrays and even other objects
 
 
*/