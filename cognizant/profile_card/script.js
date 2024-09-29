$(document).ready(function() {
    // Get the button and status elements
    var followBtn = $('#followBtn');
    var followStatus = $('#follow-status');
  
    // Toggle functionality for Follow/Unfollow
    followBtn.click(function() {
      if (followBtn.text() === 'Follow') {
        followBtn.text('Unfollow');
        followStatus.removeClass('hidden'); // Show follow status
      } else {
        followBtn.text('Follow');
        followStatus.addClass('hidden'); // Hide follow status
      }
    });
  });
  