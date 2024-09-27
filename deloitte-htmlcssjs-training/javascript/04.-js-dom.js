// Get the element with the specified ID
var element = document.getElementById('elementId');

// Do something with the element
if (element) {
    console.log('Element found:', element);
} else {
    console.log('Element not found');
}

element.textContent = 'Hello, World!';
element.style.color = 'red';
