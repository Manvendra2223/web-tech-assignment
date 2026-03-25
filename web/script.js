function validateForm() {
    let name = document.getElementById("name").value;
    let age = document.getElementById("age").value;

    if (name === "" || age === "") {
        alert("All fields are required!");
        return false;
    }

    if (age < 18) {
        alert("Age must be 18 or above");
        return false;
    }

    alert("Form submitted successfully!");
    return true;
}