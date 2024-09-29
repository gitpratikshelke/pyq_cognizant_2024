const tabs=document.querySelectorAll('.tab');
const contents=document.querySelectorAll('.tab-content');

tabs.forEach((tab,index)=>{
    tab.addEventListener('click',() =>{
        tabs.forEach(tab => tab.classList.remove('active'));


        tab.classList.add('active');

        contents.forEach(content => content.style.display='none');

        document.getElementById(`content${index + 1}`).style.display='block';
    });

});
