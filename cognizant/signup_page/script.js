document.getElementById('signupForm').addEventListener('submit', function(event) {
    event.preventDefault();
  
    // Get form fields
    const username = document.getElementById('username').value.trim();
    const email = document.getElementById('email').value.trim();
    const password = document.getElementById('password').value.trim();
  
    // Get error message elements
    const usernameError = document.getElementById('usernameError');
    const emailError = document.getElementById('emailError');
    const passwordError = document.getElementById('passwordError');
  
    // Reset error messages
    usernameError.style.display = 'none';
    emailError.style.display = 'none';
    passwordError.style.display = 'none';
  
    let hasError = false;
  
    // Username validation
    if (username === '') {
      usernameError.style.display = 'inline';
      hasError = true;
    }
  
    // Email validation
    if (email === '') {
      emailError.textContent = 'Email is required';
      emailError.style.display = 'inline';
      hasError = true;
    } else if (!validateEmail(email)) {
      emailError.textContent = 'Please enter a valid email';
      emailError.style.display = 'inline';
      hasError = true;
    }
  
    // Password validation
    if (password === '') {
      passwordError.style.display = 'inline';
      hasError = true;
    }
  
    // If no errors, submit the form
    if (!hasError) {
      alert('Form submitted successfully!');
    }
  });
  
  // Email validation function
  function validateEmail(email) {
    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return re.test(String(email).toLowerCase());
  }