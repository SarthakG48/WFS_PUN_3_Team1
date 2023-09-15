const organizeMeetingForm = document.getElementById('organize-meeting-form');

organizeMeetingForm.addEventListener('submit', function (event) {
    event.preventDefault(); // Prevent form submission

    // Get form input values
    const meetingName = document.getElementById('meeting-name').value;
    const title = document.getElementById('title').value;
    const meetingDate = document.getElementById('meeting-date').value;
    const startTime = document.getElementById('start-time').value;
    const duration = document.getElementById('duration').value;
    const meetingType = document.getElementById('meeting-type').value;
    const searchMembers = document.getElementById('search-members').value;
    const selectRoom = document.getElementById('select-room').value;

    // Create a new meeting object
    const newMeeting = {
        meetingName,
        title,
        meetingDate,
        startTime,
        duration,
        meetingType,
        searchMembers,
        selectRoom,
    };

    // Retrieve existing scheduled meetings from localStorage or initialize an empty array
    const existingMeetings = JSON.parse(localStorage.getItem('scheduledMeetings')) || [];

    // Add the new meeting to the existing scheduled meetings
    existingMeetings.push(newMeeting);

    // Save the updated scheduled meetings to localStorage
    localStorage.setItem('scheduledMeetings', JSON.stringify(existingMeetings));

    // Clear the form fields
    clearFormFields();

    // Redirect to Manager Page after saving
    window.location.href = '/Manager.html';
});

// Function to clear form fields
function clearFormFields() {
    organizeMeetingForm.reset();
}
function cancelSubmission(){
    window.location.href = '/Manager.html';
}



function logout(){
    a = document.getElementById("logout");
    window.location.href = '/index.html';
}