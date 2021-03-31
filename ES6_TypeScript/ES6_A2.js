"use strict";
//Assignment2 Q1
class fibo {
    constructor(n, arr = [0, 1]) {
        this.n = n;
        this.arr = arr;
        let previousNo = 0;
        let currentNo = 1;
        let next = currentNo;
        while (n > 2) {
            next = currentNo + previousNo;
            previousNo = currentNo;
            currentNo = next;
            arr.push(next);
            n--;
        }
        var myIterator = this.arr[Symbol.iterator]();
    }
    next() {
        //return this.arr.length >0 ? {value: this.arr.shift(), done:false} : {value: undefined, done:true};
        //Used symbol here
        var myIterator = this.arr[Symbol.iterator]();
        let val;
        while (!(val = myIterator.next()).done) {
            console.log(val.value);
        }
    }
}
let ob9 = new fibo(5);
console.log(ob9.next());
//Assignment2 q2
let iterable1 = [1, 2, 3, 4, 5, 6]; //Our ideal Armstrong numbers
function createIterator1(array) {
    let count = 0;
    return {
        getNextArmstrong1: function () {
            return count < array.length ?
                { value: array[count++], done: false } :
                { value: undefined, done: true };
        }
    };
}
let myIterator1 = createIterator1(iterable1);
console.log(myIterator1.getNextArmstrong1());
// Assignment2 q3
function* generatorFunc(n1) {
    /*for(let i = n1; i<1000;i++){
        let dig = i;
        let sum =0;
        while(dig>0){
            let rem = dig%10;
            sum += rem*rem*rem;
        }
        if(sum == dig){
            console.log(dig);
            yield 1;
        }
    }*/
    let list = [153, 370, 371, 407]; //list of armstrong numbers
    for (let item of list) {
        yield item;
    }
    yield null;
}
var generatorObject = generatorFunc(128);
console.log(generatorObject.next().value);
console.log(generatorObject.next().value);
console.log(generatorObject.next().value);
console.log(generatorObject.next().value);
var generatorObject = generatorFunc(128); //resetting
console.log(generatorObject.next().value);
console.log(generatorObject.next().value);
;
//got to know there is no way to reset a generator --so re-declare and assign again
// https://stackoverflow.com/questions/23848113/is-it-possible-to-reset-an-ecmascript-6-generator-to-its-initial-state
/*
let getNextArmstrong = new Promise((function (resolve, reject){
    (num:number)=>{
        if(num>=1000){
            reject('Error number is above or equal to 1000');
        }else{
            function():GeneratorFunction{

            }
        }
    }
}));*/
/*
4.	Collections: Using Set & Map, create a static data for chatting application.
Here we have 2 chatrooms, every chatroom is having 3 users & every user has posted
different messages in a chat room. Note that one user can belong to a single chat room only.
Now you need to find out how you will hold this data using Set & Map data structures.
Also add functionality to get list of all users from a specific chatroom & listing down all message from a chatroom.
*/
class ChatRoom {
    constructor(roomNo, ...user) {
        this.roomNo = roomNo;
        this.user = user;
    }
    getAllUsers() {
        this.user.forEach(i => console.log(i.name));
    }
    getAllMessages() {
        this.user.forEach(i => console.log(i.messages));
    }
}
class Users {
    constructor(name, ...messages) {
        this.name = name;
        this.messages = messages;
    }
}
let user1 = new Users("vunnam", "yes bro", "Hi", "are you there!");
let user5 = new Users("nobita", "evaddra vadu", "nen", "nenu ranu  peh!");
let user2 = new Users("madhu", "yes bro", "Hi", "are you there!");
let user3 = new Users("naruto", "iidu", "evado", "kuda thelvad!");
let user4 = new Users("govindh", "iiduu kuda", "na", "friende!");
let user6 = new Users("krrish", "yes bro", "Hi", "are you there!");
let chatRoom1 = new ChatRoom(1, user1, user2, user3);
let chatRoom2 = new ChatRoom(1, user4, user5, user6);
let allUsers = new Set();
allUsers.add(user1);
allUsers.add(user2);
allUsers.add(user3);
allUsers.add(user4);
allUsers.add(user5);
allUsers.add(user6);
allUsers.add(user6); //ignored
//users and chat room mapping;
let userRoom = new Map();
userRoom.set(user1, chatRoom1);
userRoom.set(user2, chatRoom1);
userRoom.set(user3, chatRoom1);
userRoom.set(user4, chatRoom2);
userRoom.set(user5, chatRoom2);
userRoom.set(user6, chatRoom2);
console.log(allUsers);
console.log(userRoom);
console.log(userRoom.get(user4));
chatRoom1.getAllUsers();
chatRoom1.getAllMessages();
chatRoom2.getAllUsers();
