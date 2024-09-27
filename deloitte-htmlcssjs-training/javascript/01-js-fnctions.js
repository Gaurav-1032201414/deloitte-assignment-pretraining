// // Define a function that takes a callback
// function fetchData(callback) {
//     setTimeout(() => {
//         const data = { name: "John", age: 30 };
//         callback(data);
//     }, 1000);
// }

// // Define a callback function
// function handleData(data) {
//     console.log("Data received:", data);
// }

// // Call the function with the callback
// fetchData(handleData);


// Value = ???
// const fun = (a) => {
//     console.log(a.city);

// };

// fun({ city: "Bangalore" });

// const fun = (a) => {
//     a();
//     console.log("fun function invoked");


// };

// fun(() => {
//     console.log("callback function invoked");
// });

// const fun = (a) => {
//     console.log(a * 2);
// };

// fun(10);
// const num = 10;
// fun(num);


//  ================================================

// const fun = (arg) => {
//     arg({city: "Bangalore"});
//     console.log("fun function invoked");
// };

// fun((a) => {console.log("a.city");});    


// function fetchData(callback) {
//     setTimeout(() => {
//         const data = { name: "John", age: 30 };
//         callback(data);
//     }, 1000);
// }

// function handleData(data) {
//     console.log("Data received:", data);
// }

// fetchData(handleData);


// function fetchData() {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             const data = { name: "John", age: 30 };
//             resolve(data);
//         }, 1000);
//     });
// }

// fetchData()
//     .then((data) => {
//         console.log("Data received:", data);
//     })
//     .catch((error) => {
//         console.error("Error:", error);
//     });

console.log("Math.PI:", Math.PI);
console.log("Math.E:", Math.E);
console.log("Math.abs(-5):", Math.abs(-5));
console.log("Math.ceil(4.2):", Math.ceil(4.2));
console.log("Math.floor(4.8):", Math.floor(4.8));
console.log("Math.round(4.5):", Math.round(4.5));
console.log("Math.max(1, 2, 3):", Math.max(1, 2, 3));
console.log("Math.min(1, 2, 3):", Math.min(1, 2, 3));
console.log("Math.pow(2, 3):", Math.pow(2, 3));
console.log("Math.sqrt(16):", Math.sqrt(16));
console.log("Math.random():", Math.random());
console.log("Math.sin(Math.PI / 2):", Math.sin(Math.PI / 2));
console.log("Math.log(Math.E):", Math.log(Math.E));