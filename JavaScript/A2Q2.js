function person(firstName,lastName,age,skills,dateofbirth,address,married,profession)
{
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
    this.skills=skills;
    this.dateofbirth=dateofbirth;
    this.address=address;
    this.married=married;
    this.profession=profession;
    
}

 var p1=new person("Madhu","Simhadri","20",["C","C++","Java"],"07/05/2000",{city:"Bhimavram",pincode:"534210"},false,"Analyst")

var p2=new person("Vunnam","LaksmiNarayan","20",["C","C++","Java"],"07/05/2000",{city:"Khammam",pincode:"522210"},false,"Analyst")

print=function()
{
    console.log(p1);
    console.log(p2)
}();
