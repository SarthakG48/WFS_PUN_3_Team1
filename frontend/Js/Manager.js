function submitForm(event) {
    var form = document.getElementById('form');
    event.preventDefault();
    // form.submit();
}



var participant1 = {"name":"John Doe","email":"john@gmail.com","phone":"1234567890","role":"Admin"};
var participant2 = {"name":"Mary","email":"mary@gmail.com,","phone":"1234567890","role":"User"};
var list=JSON.parse(localStorage.getItem('scheduledMeetings'));


localStorage.setItem('participant1', participant1.name);
localStorage.setItem('participant2', participant2.name);
// console.log(JSON.parse(localStorage.getItem('scheduledMeetings')));

var participants = [localStorage.getItem('participant1'), localStorage.getItem('participant2')];

document.getElementById('participantsForMeeting1').innerText = participants;
document.getElementById('participantsForMeeting2').innerText = participants;



    console.log(JSON.parse(localStorage.getItem('scheduledMeetings'))[0].title);
    var meetingName = list[list.length-1].title;
    var meetingDate = list[list.length-1].meetingDate;

    var meetingTime =list[0].startTime;
    var duration = list[0].duration;
   var meetingParticipants = list[0].searchMembers;



    // var meeting = {"meetingName":meetingName,"meetingDate":meetingDate,"meetingTime":meetingTime,"meetingParticipants":meetingParticipants};
    // localStorage.setItem('meeting', meeting);
    // console.log(localStorage.getItem('meeting'));

    // alert("Meeting added successfully");
    // document.getElementById('title').value = localStorage.getItem('meeting').name;
    // document.getElementById('date').value = localStorage.getItem('meeting').date;
    // document.getElementById('time').value = localStorage.getItem('meeting').time;
    // document.getElementById('participantsForMeeting3').value = localStorage.getItem('meeting').meetingParticipants;
    document.getElementById('newMeeting').innerHTML = "<td>"+meetingName+"</td>"+"<td>"+meetingDate+"</td>"+"<td>"+meetingTime+"</td>"+"<td>"+meetingParticipants+"</td>";



function logout(){
    a = document.getElementById("logout");
    window.location.href = '/index.html';
}

function BookMeetingRoom(){
    window.location.href = '/organise_meeting.html';
}