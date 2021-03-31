//Assignment1 q1
const a=5;
console.log(a);
//a=10; // shows error cannot assign to a because it is a constant.

//Assignment1 q2
let b=10;
if(b===10)
{
    let c=20;
    console.log(c);
}
//console.log(c); shows  error cannot find c.

//Assignment1 q3
const Order=
{
    id:1,
    title:"something",
    price:100,
    printOrder:function()
    {
        //console.log("The product is something");
    },
    getPrice:function()
    {
        //console.log("The price is")
    }

}

let copy=Object.assign({},Order);
console.log(copy);

//Assignment1 q4

const names=["Madhu","Hs","Vunnam"];
names.forEach(element => {
    console.log(`"name":${element},"length" :${element.length}`);
});
console.log(typeof names);


//Assignment1 q5
//a.default
let add=function(x:any=10,y:any=100)
{
    console.log(x+y);
}

add(30,20);//50
add(); //110

//b.rest operator

let userFriends=function(friend:string,...friends:any)
{
    console.log(friend);
    console.log(friends);
    for(let i in friends)
    {
        console.log(friends[i]);
    }
}
let friend="Madhu";
userFriends(friend,"Hs","Sri","Vunnam");

//c.spread operator

let printCapitals=function(p:any,...q:any)
{
console.log(q.toUpperCase);
}

let q=["madhu","hs","sri","sruthi","yajna"];
//printCapitals(5,...q.toUpperCase());

//Assignment1 q6
const ticket="sysnet";
const customer="madhu";
const laptopM="Pavilion 8th gen";

console.log(`Hello ${ticket}!
I am ${customer} and
My laptop model is ${laptopM}`);

//Assignment1 q7
//a
let d1=["Madhu","Simhadri","Male",20];
let[firstName,lastName,gender,age]=d1;
console.log(gender);

//b

let organisation={
    name7:"Madhu",
    address:{
        street:"ASR Nagar",
        city:"Bhimavaram",
        pincode:534201
    }
};
console.log(organisation.address.pincode);

// organisation[Symbol.iterator]=function()
// {
//     let properties=Object.keys(organisation);
//         let count=0;
//          let isDone=false;
//          let next=()=>
//          {
//              if(count>=properties.length)
//              {
//                  isDone=true;
//              }
//              return{
//                  done:isDone,value:this[properties[count++]];
//              };
//          }
//          return {next};
//      }
    
//      for (let p of organisation)
//      {
//          console.log(organisation);
//      }
// }

//Assignment1 q8

class Account
{
    constructor(name:string,id:number,balance:number)
    {
        console.log(name+"Customer's Name");
    }
    getAccountID()
    {
        return 123456789;
    }
    getBalance()
    {
       let ba= 200000;
       return ba;
    }
}

class savingAccount extends BAccount{
    constructor(name:string,id:number,balance:number)
    {
        super(name,id,balance);
        console.log(name +"Savings Account");
    }
    getInterest()
    {
        let i= 5000;
        return i;
    }

}

class currentAccount extends savingBAccount{
    constructor(name:string,id:number,balance:number)
    {
        super(name,id,balance);
        console.log(name +"current Account");
    }
    getCashCredit()
    {
        return this.getInterest()+this.getBalance();
       
    }


}

let totalbalance=new currentBAccount("Madhu",123456789,200000);
console.log("Total Balance:" +totalbalance.getCashCredit());