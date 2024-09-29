document.getElementById('signupForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form from submitting by default
  
    // Get form field values
    var username = document.getElementById('username').value.trim();
    var email = document.getElementById('email').value.trim();
    var password = document.getElementById('password').value.trim();
  
    // Error message elements
    var usernameError = document.getElementById('usernameError');
    var emailError = document.getElementById('emailError');
    var invalidEmailError = document.getElementById('invalidEmailError');
    var passwordError = document.getElementById('passwordError');
  
    // Regex for valid email
    var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  
    // Reset error messages
    usernameError.style.display = 'none';
    emailError.style.display = 'none';
    invalidEmailError.style.display = 'none';
    passwordError.style.display = 'none';
  
    var isValid = true;
  
    // Check if username is empty
    if (username === '') {
      usernameError.style.display = 'block';
      isValid = false;
    }
  
    // Check if email is empty or invalid
    if (email === '') {
      emailError.style.display = 'block';
      isValid = false;
    } else if (!emailPattern.test(email)) {
      invalidEmailError.style.display = 'block';
      isValid = false;
    }
  
    // Check if password is empty
    if (password === '') {
      passwordError.style.display = 'block';
      isValid = false;
    }
  
    // If all validations pass, the form would proceed to submit
    if (isValid) {
      alert("Form submitted successfully!");
      // Here, you could proceed with form submission logic (e.g., send data to the server)
    }
  });
  