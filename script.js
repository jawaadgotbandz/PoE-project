document.addEventListener('DOMContentLoaded', function() {
  const ham = document.getElementById('ham');
  const menu = document.getElementById('menu');
  if (ham && menu) {
    ham.addEventListener('click', function() {
      menu.classList.toggle('active');
    });
  }

  const amountBtns = document.querySelectorAll('.amount-btn, .donate-btn, [data-amount]');
  const selectedDisplay = document.getElementById('selectedAmount');
  const finalAmount = document.getElementById('finalAmount');
  const amountInput = document.getElementById('donationAmount');

  amountBtns.forEach(function(btn) {
    btn.addEventListener('click', function() {
      amountBtns.forEach(b => b.classList.remove('selected-amount'));
      this.classList.add('selected-amount');
      let val = this.dataset.amount || this.textContent.replace(/[^0-9]/g, '');
      if (selectedDisplay) selectedDisplay.textContent = 'R' + val;
      if (finalAmount) finalAmount.textContent = 'R' + val;
      if (amountInput) amountInput.value = val;
    });
  });
});

function filterServices() {
  let input = document.getElementById('searchService').value.toLowerCase();
  let cards = document.querySelectorAll('.service-card');
  cards.forEach(card => {
    let text = card.textContent.toLowerCase();
    if (text.includes(input)) {
      card.classList.remove('hidden');
    } else {
      card.classList.add('hidden');
    }
  });
}

function openLightbox(img) {
  let lb = document.getElementById('lightbox');
  let lbImg = document.getElementById('lightbox-img');
  if (lb && lbImg) {
    lbImg.src = img.src;
    lb.classList.add('active');
  }
}
function closeLightbox() {
  let lb = document.getElementById('lightbox');
  if (lb) lb.classList.remove('active');
}
// Lightbox - Part 3
function openLightbox(img){
  document.getElementById('lightbox').style.display='flex';
  document.getElementById('lightboxImg').src=img.src;
}
function closeLightbox(){
  document.getElementById('lightbox').style.display='none';
}
// Part 2 - Hamburger mobile menu
const hamburger = document.getElementById('hamburger');
const navMenu = document.querySelector('nav ul');
if (hamburger && navMenu) {
  hamburger.addEventListener('click', () => {
    navMenu.classList.toggle('active');
  });
}

// Part 3 - Lightbox - only this, no other code
function openLightbox(img) {
  const lightbox = document.getElementById('lightbox');
  const lightboxImg = document.getElementById('lightboxImg');
  if (lightbox && lightboxImg) {
    lightbox.style.display = 'flex';
    lightboxImg.src = img.src;
  }
}

function closeLightbox() {
  const lightbox = document.getElementById('lightbox');
  if (lightbox) {
    lightbox.style.display = 'none';
  }
}
// Search Filter - Part 3 - uses searchServices id
function filterServices() {
  const input = document.getElementById('searchServices');
  if (!input) return;
  const filter = input.value.toLowerCase();
  const cards = document.querySelectorAll('.service-card, .card, .services div, .service');

  cards.forEach(card => {
    const text = card.textContent.toLowerCase();
    card.style.display = text.includes(filter) ? '' : 'none';
  });
}