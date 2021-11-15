const body = document.querySelector("body");
const modal = document.querySelector(".modal");
const modalButton = document.querySelector(".modal-button");
const closeButton = document.querySelector(".close-button");
const scrollDown = document.querySelector(".scroll-down");
let isOpened = true;

const openModal = () => {
    modal.classList.add("is-open");
    body.style.overflow = "hidden";
};


window.onload( openModal());