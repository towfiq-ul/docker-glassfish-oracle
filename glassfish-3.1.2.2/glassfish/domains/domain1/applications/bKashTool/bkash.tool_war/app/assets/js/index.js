var idleTime = 0;
$(document).ready(function() {
    //  alert('IN Ready Function');
//    console.log('Activity Checker!!!!');
    //Increment the idle time counter every minute.
    var idleInterval = setInterval(timerIncrement, 60000); // 1 minute

    //Zero the idle timer on mouse movement.
    $(this).mousemove(function(e) {
        idleTime = 0;
    });
    $(this).keypress(function(e) {
        idleTime = 0;
    });
});

function timerIncrement() {
    idleTime = idleTime + 1;
//    console.log('Counting Idle Time: '+ idleTime);
    if (idleTime > 29) { // 20 minutes
        window.location.reload();
    }
}

