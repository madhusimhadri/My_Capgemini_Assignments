console.log("Hello Madhu")
function person1(fName,lName,age,skills,date0fbirth,address,married,profession)
{
    this.fName=fName;
    this.lName=lName;
    this.age=age;
    this.skills=skills;
    this.date0fbirth=date0fbirth;
    this.address=address;
    this.married=married;
    this.profession=profession;
}

var p1=new person1("Madhu","Simhadri",20,["c","c++","Java","Python","MongoDB"],"07/05/2000",{city:"Bhimavaram",pincode:"534210"},false,"Analyst")

var p2=new person1("Teja","Karri",20,["pulihora","stalking","watching serials"],"13/06/2000",true,"gokist")
 
var p2=Object.create(p1);
print=function()
{
    console.log(p1);
    console.log(p2.address);
    
}();

console.log(p2)