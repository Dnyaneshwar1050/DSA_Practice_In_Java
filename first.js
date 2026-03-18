let number = prompt("enter a number");

if(number % 5 === 0){
    console.log("yes");
}else{
    console.log("No")
}







let scores = 95;
let grade;
if(scores >= 80 && scores <= 100){
//     console.log("student pass in grade A");
    grade = "A";
}else if(scores >= 70 && scores <= 79){
    // console.log("student pass in grade B");
    grade = "B";
}else if(scores >= 60 && scores <= 69){
    // console.log("student pass in grade C");
    grade = "C";
}else if(scores >= 50 && scores <= 59){
    // console.log("student pass in grade D");
    grade = "D"
}else if(scores >= 0 && scores <= 49){
    // console.log("student pass in grade F");
    grade = "F";
}else{
    // console.log("undefine scores")
    grade = "undefine";
}

console.log(grade);










// for-of-loop

// let str = "ApnaCollege";

// for (let i of str){
//     console.log(i);
// }/








for(let i = 0;i<=100;i++){
    if(i%2===0){
        console.log(i);
    }
}



let game = 25;
let num = prompt("Guess the number : ");

while(game != num){
    num = prompt("Guess right number : ");
}
console.log("you enter a right number : "+num);






let str = "apnaCollage";
let str1 = 'danny';





let marks = [85, 97, 44, 37, 76, 60];

let sum = 0;

for(let i of marks){
    sum += i;
}
let avr = sum / marks.length;
console.log(avr)


let newbutton = document.createElement("button");
newbutton.innerText = "click me !";

newbutton.style.color = "white";
newbutton.style.backgroundColor= "red";
document.querySelector("body").prepend(newbutton);


let newBtn = document.querySelector("#mode");
let body = document.querySelector("body");
let currMode = "light";

newBtn.addEventListener("click", () => {
    if(currMode === "light"){
       currMode = "dark";
       body.classList.add("dark");
       body.classList.remove("light");
    }
    else{
        currMode = "light";
        body.classList.add("light");
        body.classList.remove("dark");
    }
    console.log(currMode);
});









const numVowel =(str) => {
    let count = 0;
    for(const char of str){
        if(char === "a" || char === "e" || char === "i" || char === "o" ||char === "u"){
            count++;
        }
    }
    console.log(count);
}


const URL = "https://cat-fact.herokuapp.com/facts";
const para = document.querySelector("#fact");
const btn = document.querySelector("#mode")

const getFacts = async () => {
    console.log("getting data.....");
    let response = await fetch(URL);
    console.log(data);
    let data = await response.json();
    para.innerText = data[0].text;
};


btn.addEventListener("click", para);




console.log("A"+1);
console.log("dnyaneshwar" + 100);
console.log('4'-2+'2');

