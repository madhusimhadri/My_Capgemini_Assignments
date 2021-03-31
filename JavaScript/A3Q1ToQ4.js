//q1
const compose=(f1,f2)=>value=>f1(f2(value))

const double=(x)=>{
    return x*2;
}

const square=(x)=>
{
    return x*x;
}

const composedValue=compose(square,double);
console.log("The value of composed function is: "+composedValue(5));

//q2

const compose2=(a1,a2)=>(data)=>a1(a2(data));

const double2=(v)=>
{
    return v*2;
}

const square2=(v)=>
{
    return v*v;
}
const composedValue2=compose(square2,double2);
const composedValue3=compose(double2,square2)

console.log("The value of the function: "+composedValue2(5));
console.log("The value of the function: "+composedValue2(10));
console.log("The value of the function: "+composedValue3(5));
console.log("The value of the function: "+composedValue3(10));

//q3

function isEven(num)
{
    for(let i=0;i<num;i++)
    {
        if(num%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

console.log("The first Even element in the array:"+[2,3,4,5,6].find(isEven));

//q4
let numbers=[4,9,16,25,36];
let squares=[];
let squareRoot=[];

numbers.forEach(num=>squares.push(num*num));
numbers.forEach(nums=>squareRoot.push(Math.sqrt(nums)));
console.log(squares);

console.log("The squares of the numbers are :[" +squares +"]");
console.log("The square root of the numbers are :[" +squareRoot+ "]");