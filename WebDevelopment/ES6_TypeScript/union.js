"use strict";
function combine(input1, input2, resultConversion) {
    let result;
    if (typeof input1 === "number" && typeof input2 === "number" || resultConversion === "as-number")
        result = +input1 + +input2; //forced conversion from string to number
    else
        result = input1.toString() + input2.toString();
    return result;
    // if(resultConversion==="as-number")
    // {
    //     return +result;
    // }
    // else
    // {
    //     return result.toString();
    // }
}
const combinedNumbers = combine(20, 30, "as-number");
const combinedNames = combine("Madhu", "Simhadri", "as-text");
console.log(combinedNames);
console.log(combinedNumbers);
const combinedStringNumbers = combine("30", "20", "as-number");
console.log(combinedStringNumbers);
