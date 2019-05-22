const tabItems = document.querySelectorAll('.tab-item');
const tabContentItems = document.querySelectorAll('.tab-content-item');

//
const tabs = document.querySelectorAll('.tabs');
const tabContent = document.querySelectorAll('.tab-content');

//modal content
const modal = document.getElementById('simpleModal');
const modalBtn = document.getElementById('modalBtn');

//button sing in
const singInButtonContent = document.getElementById('singInButtonContent');

// Select tab content item
function selectItem(e) {
    // Remove all show and border classes
    removeBorder();
    removeShow();
    // Add border to current tab item
    this.classList.add('tab-border');
    // Grab content item from DOM
    const tabContentItem = document.querySelector(`#${this.id}-content`);
    // Add show class
    tabContentItem.classList.add('show');
}

// Remove bottom borders from all tab items
function removeBorder() {
    tabItems.forEach(item => {
        item.classList.remove('tab-border');
    });
}

// Remove show class from all content items
function removeShow() {
    tabContentItems.forEach(item => {
        item.classList.remove('show');
    });
}

// Listen for tab item click
tabItems.forEach(item => {
    item.addEventListener('click', selectItem);
});

// sing in
singInButtonContent.addEventListener('click', singInAction);

function singInAction(){
    const inputUserName = document.getElementById('inputUserName');
    const inputPassword = document.getElementById('inputPassword');
    if ((inputUserName.value === 'lan') && (inputPassword.value === 'lan')) {
        tabs[0].style.display = 'flex';
        tabContent[0].style.display = 'flex';
        return true;
    }
    else {
        return false;
    }

};

//modal action
modalBtn.addEventListener('click', openModal);

function openModal() {
    if (modal.style.display === 'flex' && modalBtn.innerHTML === 'Hide Login') {
        modal.style.display = 'none';
        modalBtn.innerHTML = 'Show Login';

    } else {
        modal.style.display = 'flex';
        modalBtn.innerHTML = 'Hide Login';
    }
}