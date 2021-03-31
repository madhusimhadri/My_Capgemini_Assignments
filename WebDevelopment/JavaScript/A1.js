const { maxHeaderSize } = require("http");
console.log("Madhu Simhadri.............................")
//q1
function check(a)
{
if (a%2==0)
console.log(true);
console.log(false);
}

check(5);

//q2

function max(array)
{
    var n1=array[0];
    for(var i=1;i<array.length;i++)
    {
        if(array[i]>n1)
        n1=array[i];
    }
    return n1;
}
console.log(max([1,2,3,4,5]));

//q20
var myarray=["madhu","hs","bhaggu"]
myarray.push("sruthi","sri")
console.log(myarray);

//21
var myarray3=[1,3,2]
var removed=myarray3.pop() //...removes last element
console.log(myarray3);
//q22
var myarray1=[1,3,2]
var removed=myarray1.shift()  //...removes first element
console.log(myarray1);
//q23
var myarray2=[1,3,2]
var add=myarray2.unshift("22")  //...adds element at the beginning
console.log(myarray2);