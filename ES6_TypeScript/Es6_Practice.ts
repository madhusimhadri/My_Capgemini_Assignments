console.log("MY wish")
console.log("get lost")
//sets
let mySet=Object.create(null);
mySet.id=true;
if(mySet.id)
{
    console.log("id exists")
}

//maps
let myMap=Object.create(null);
myMap.name="Madhu";
let val=myMap.name;
console.log(val);

myMap[100]="Hello";
console.log(myMap["100"]);

//
let ob1={};
let ob2={};
let mySet2=new Set();
mySet2.add("Hello");
mySet2.add(1);
mySet2.add(1);
mySet2.add(ob1);

mySet2.add(ob2);
console.log(mySet2.size);//ignores duplicate value and return size =2 instead of 3.
//ob1 and ob2 are unique. so it counts each one.

let newSet=new Set([1,2,3,4,5,4,4,5]) //5 as output
console.log(newSet.size);

let chainSet =new Set().add("Hello").add("Madhu");
console.log(chainSet.size); //2 as output

console.log(newSet.has(1));
console.log(newSet.delete(5));
console.log(newSet.size);

//weak set
let newSet3=new WeakSet();
var key={};

newSet3.add(key);
console.log(newSet3.has(key));

//maps
let myMap3= new Map();
myMap3.set("fname","Madhu");
myMap3.set("age",30);
console.log(myMap3.get("fname"));

let ob3={};
let ob4={};
myMap3.set(ob3,10);
myMap3.set(ob4,20);
console.log(myMap3.get(ob3));
myMap3.delete("fname");
myMap3.clear();
console.log(myMap3.size);
console.log(myMap3.has("fname"));

let myMap4=new Map([["fname","Madhu"],["lname","Simhadri"]]);

for(let key of myMap4.keys())
{
    console.log(key);
}

for(let value of myMap4.values())
{
    console.log(value);
}

for(let entry of myMap4.entries())
{
    console.log(`${entry[0]}->${entry[1]}`);
    
}

for(let [key,value] of myMap4.entries())
{
    console.log(`${key}->${value}`);
    
}

//for Each for arrays

var numbers=[2,4,6,8];
numbers.forEach(arrayFunction);
function arrayFunction(element:number,index:number,array:any)
{
    console.log("arr["+index+"]= " +element);
}

//for Each for maps
let myMap5=new Map([["fname","Madhu"],["lname","Simhadri"]]);

myMap5.forEach(mapFunction);
function mapFunction(value:any,key:any,callingFunction:any)
{
    console.log(key+" "+value);
    console.log(myMap5===callingFunction);
    
}

//for Each for sets

let mySet5=new Set([2,4,6]);
mySet5.forEach(setFunction);
function setFunction(value:any,key:any,callingSet:any)
{
    console.log(key +" "+value); //keys and values are same for sets
    console.log(mySet5===callingSet)
}

// //weak map
// let myMap6=new WeakMap();
// let ob6={};
// myMap.set(ob6,"Hello World");
// console.log(myMap.get(ob6));
// ob6=null;

//symbols
let s=Symbol("First Symbol");
console.log(typeof s);
console.log(s.toString());

let s2=Symbol();
let s3=Symbol();
console.log(s2===s3); // unique id is created returns false.

let s4=Symbol.for("mysymbol");
let s5=Symbol.for("mysymbol");
console.log(s4===s5) //returns true

//key for symbol
console.log(Symbol.keyFor(s4));

//symbol iterator

let str="Hello";
let arr=[1,2,3];
let num=5;
let obj={name:"Chandler"};

console.log("For String: "+typeof str );
console.log("For Array: "+typeof arr);
console.log("For number: "+typeof num);
console.log("For object: "+typeof obj);

//iterable and iterator

let iterable=[1,3,4];
function createIterator(array:any)
{
    let count=0;
    return{
        next: function()
        {
            return count<array.length?{value:array[count++],done:false}:
                                    {value:undefined,done:true};

        }
    }
}

let myIterator=createIterator(iterable);
console.log(myIterator.next());
console.log(myIterator.next());
console.log(myIterator.next());
console.log(myIterator.next());

//Iterating objects

// let person6={fname:"Madhu",lname:"Simhadri"};

// person6[Symbol.iterator]=function()
// {
//     let properties=Object.keys(person6);
//     let count=0;
//     let isDone=false;
//     let next=()=>
//     {
//         if(count>=properties.length)
//         {
//             isDone=true;
//         }
//         return{
//             done:isDone,value:this[properties[count++]];
//         };
//     }
//     return {next};
// }

// for (let p of person6)
// {
//     console.log(p);
// }

//Generators

function *createGenerator()
{
    yield 1;
    console.log("After 1st yield");
    yield 2;

}
let myGen=createGenerator();
console.log(myGen.next());
console.log(myGen.next());
console.log(myGen.next());
