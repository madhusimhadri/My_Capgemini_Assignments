console.log("Hello from madhu");
//1
var Rectangle={
    height:100,width:50
}
Rectangle.height=200
console.log("Changed Height is " + Rectangle.height)
//2
Rectangle.getArea=function()
{
    return this.height* this.width;
}

console.log("Area is "+Rectangle.getArea())
//3

function rectangle(height,width)
{
    this.height=height;
    this.width=width;
}
rectangle.prototype.getArea2=function()
{
    return this.height*this.width;
}

var rect=new rectangle(10,5)
rect.height=50;
console.log("Area taken from constructor is " + rect.getArea2())

//4
var object1=
{
    firstName:"Madhu",
    lastName:"Simhadri"
    
}
console.log("Looking Up FirstName "+object1.firstName)
object1.lastName="abcdefg"
console.log("Looking Up FirstName "+object1.lastName)

//5
object1.middleName="Naidu"

console.log(object1)
console.log(object1.middleName)

//6
var str=({"fName":"Madhu","lName":"Simhadri"})
var json=eval(str)
console.log(json)
console.log(json.fName)
console.log(typeof(str)) //object

//7

var str1=({"fName":"Madhu","lName":"Simhadri"})
var real=JSON.parse('{"fName":"Madhu","lName":"Simhadri"}')
console.log(real)
console.log(typeof(real)) //object


