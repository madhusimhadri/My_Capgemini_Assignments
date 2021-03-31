"use strict";
//Assignment3 Q1
var add1 = function (A, B) {
    return new Promise((resolve, reject) => {
        var sum = A + B;
        if (sum) {
            resolve(sum);
        }
        else {
            reject(Error("Could not add the two values"));
        }
    });
    ;
};
add1(2, 2).then((added) => {
    console.log("Addition is: " + added);
});
//Assignment3 Q2
// class BankAccount
// {
//     constructor(name:string,id:number,balance:number)
//     {
//         console.log("Customer's Name:"+name+ " "+ "Id: " +id + " "+ "balance: "+balance) ;
//     }
//     getAccountID()
//     {
//         // return 123456789;
//     }
//     getBalance()
//     {
//     //    let balance= 200000;
//     //    return balance;
//     }
// }
// class savingBankAccount extends BankAccount{
//     constructor(name:string,id:number,balance:number)
//     {
//         super(name,id,balance);
//         //console.log(name +"Savings Account");
//     }
//     getInterest()
//     {
//         let i=5000;
//         return i;
//     }
// }
// class currentBankAccount extends savingBankAccount{
//     constructor(name:string,id:number,balance:number)
//     {
//         super(name,id,balance);
//         //console.log(name +"Savings Account");
//     }
//     getCashCredit()
//     {
//         return this.getInterest() + this.getBalance();
//     }
// }
// let totalBankBalance=new currentBankAccount("Madhu",5464564,200000);
//console.log(totalBankBalance.getCashCredit());
class BAccount {
    constructor(name, id, balance) {
        console.log(name + "Customer's Name");
    }
    getAccountID() {
        return 123456789;
    }
    getBalance() {
        let ba = 200000;
        return ba;
    }
}
class savingBAccount extends BAccount {
    constructor(name, id, balance) {
        super(name, id, balance);
        console.log(name + "Savings Account");
    }
    getInterest() {
        let i = 5000;
        return i;
    }
}
class currentBAccount extends savingBAccount {
    constructor(name, id, balance) {
        super(name, id, balance);
        console.log(name + "current Account");
    }
    getCashCredit() {
        return this.getInterest() + this.getBalance();
    }
}
let totalBbalance = new currentBAccount("Madhu", 123456789, 200000);
console.log("Total Balance:" + totalBbalance.getCashCredit());
function circle(user) {
    return `${user.print}`;
}
function Rectangle(user) {
    return `${user.print}`;
}
console.log(circle({ print }));
