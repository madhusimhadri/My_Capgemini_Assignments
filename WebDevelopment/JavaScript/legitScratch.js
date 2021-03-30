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
 
 Accessing Nested objects
 var content=object.property.property["key"];
 
 Accessing Nested Arrays
 var required=object[index].list[index];
 
*/

/*Arrow Functions--similaar to lambda expressions in java
var myconcat(arr1,arr2)=>arr1.concat(arr2);
console.log(myconcat([1,2],[3,4,5]));
*/

/*Rest Array
return function sum(...args)

*/

/*spread operator
... -three dots similar to rest
*/

/* Destructuring Assignments Important
screenshots     
*/

/*Desrtructuring Arrays
screenshots
*/

/*create Strings using Template Literals
screenshots
*/

/*Concise object literal declarations
screenshots
*/

/*Concise Declarative functions
functions inside an object
screenshots
*/

/* class syntax to define a constructor function
screenshots
*/

/*using getters and setters to control access to an object
while accessing they dont contain paranthesis ,they are similar to properties
*/

/*Difference b/w import and require
we can also import certain functions and variables from one file to another
use export to reuse a code block

use * to import everything from a file

create export fallback with export default

import a default export

 

*/

/*Composition Function
screenshots
*/

/*Function callbacks
A function that is passed as a parameter to another function is known as a callback function  
call back functions are also used for event handling
    
*/

/*Prototyping and inheritance
Java Script doesn't have concept of classes.
we have prototypes that works like classes.
new keyword here acts as creating a new object and returning that object withot we being externally writing to create and return
In java a class name follows the new keyword where as in javascript a function name foloows the new keyword.
Java script switches this function to constructor mode.

*/

/*Difference between regular functions and constructors
creates the object and returns the object
To tell the programmers that a function is called in cnstructor mode we need to use Capital letter at the begining of the function despite using camelcase.
Calling a regular function in constructor mode using the new keyword  still works.
Calling a constructor function without new keyword doesn't work! No new object gets created and the return value is undefined.

*/

/* Understanding the this reference
Four different ways to call function in javascript
screenshots
1.foo();
2.obj.foo();
3.new foo();
4. foo.call();
Method1:calling standalone functions directly
this reference:the global object

Method2:calling functions as property of an object reference
this reference:the object reference

Method3:
Calling standalone functions using new keyword
this reference: the newly created object.

Method4:
function foo()
{
    this.abc=def;

}
foo.call({});

*/

/*Prototypes
prototypes lets us build object using template or blueprint.
It is not exactly like classes because we can't create instances

JavaScript objects don't own methods. They just have properties, and any property could be a function.

There is a new class keyword in newer version of JavaScript (ES6) that simulates class like behaviour.
dunder proto=__proto__
*/

/*
The Object Function
Ways to create an object
var a={}
var b=new Object();
new Object is same as {}

The automatically created prototype is actually created by new Object.

*/

/*Inheritance in JavaScript 
Objects get inherited
Screenshots
*/

/*Using this keyword
To use the global this in a inner function we use the arrow function for that inner function 
*/

//use devtools to debug the code-more efficient

/*What is DOM?
#Introduction
Document Object Model
Created by the browser when a web page is loaded
In graphical form it looks like a tree of elements/nodes
Programically we can use Js read or change the dom

#Get Element by ID
document.getElementByID('')

#Get Multiple Elements-Get elements by class or tag name
Using class
document.getElementByClassName('')
using array index we can get the required class
using Tag
document.getElementByTagName('')
we can cycle through the html collection using arrays & for loop

#The Query Selector
document.querySelector('#wrapper')
document.querySelector('#book-list li-nth-child(2).name')
query selector returns only one element 
document.querySelectorAll('')-This returns all elements
It gives the nodelist

#Changing text and html content

#Nodes
Every single element in dom is a node

//#Traversing the DOM
child to parent
parent to children
sibling -child to child

#DOM events/ Removing content
Screenshots
Using EventListener
#Events bubbling
Screenshots
Using EventListener
#Interacting with forms
Screenshots
Using EventListener
#creating Elements
Screenshots
Using EventListener
#Attributes
book.getAttribute('class')
book.setAttribute('class','name-2')-changes class to name-2
book.hasAttribute('class')
book.removeAttribute('class')

#Checkboxes and change events(radios)
Using EventListener
screenshots

#Custom search filter
Screenshots

#Tabbed content
Screenshots

#DOM Content Loaded
When we keep the script tag in head and execute the file
the dom is not fully loaded. so the website won't respond as
we wanted it to be. So what we do is create an event listener and put all the events in it so that it loads first.

document.addEventListener('DOMContentLoaded',function()
{
    
})

*/

/*Asynchronous javascript
Asynchronous code can start something now and finish it later.
Creates a thread externally
Synchronous code runs on a single thread.
Synchronous code waits for one action to complete before starting another
screenshots

Async flow controls
Call backs-good
Promises-better
Generators-awesome


AJAX Requests
Communication with a server by making a http request.
No need to reload the page
Asynchronous JavaScript and Xml
screenshots

Synchronous call backs-screenshots
Asynchronous call back-screenshots $.get
*/

/*Regular expressions
regex101.com -site to test regexp
^-start of the string pattern
$-end of the string pattern
Way to match certain patterns
[a-zA-Z0-9]-character classes
?-optional character

Special Characters
\d- digits
\w-matches words a -z  A-Z and numbers
\s-white space
([a-z]+)-grouping 

*/
/* 
How to add Java script
In the <script> tag in the head or body
by linking a .js file
Inline(not a good prcatice)
*/

/*
Debugging in visual studio code
*/