# Changelog - MSF WEDE5020
## 2026-10-31 - Final Part 3 Fixes - Based on Part 2 Feedback
- 19:00 - Based on Part 2 feedback: Removed remaining 26 inline styles using regex \s*style="[^"]*" verified 0 results found
- 19:15 - Replaced JS .style.display with classList.add/remove .active/.hidden for lightbox and search to remove JS inline styles
- 19:30 - Standardized all CSS links to css/style.css and confirmed no broken paths, images renamed to SEO names msf-field-hospital-south-sudan.jpg etc load correctly
- 19:45 - Tested enquiry.html process response shows thank you message, map embed loads, lightbox ESC key works

## 2026-10-18 - Part 2 Submission
- Created 5 HTML pages with internal <style> tags
- Basic layout with header and nav

## 2026-10-20 - Part 3 Update
- 10:00 - Created external style.css, removed all inline <style> blocks
- 10:15 - Linked stylesheet via <link rel="stylesheet" href="style.css"> in all 5 pages
- 10:30 - Added CSS reset, base styles, typography scale, Flexbox/Grid layout
- 10:45 - Added hover, focus, active pseudo-classes
- 11:00 - Added viewport meta and responsive media queries (768px, 480px) for layout, typography, nav, images
- 11:15 - Implemented responsive images with srcset, sizes, and picture element
- 11:30 - Added SEO: unique title tags, meta description, meta keywords per page, descriptive image names and alt-text
- 11:45 - Added interactive Google Map embed on where-we-work.html
- 12:00 - Added gallery lightbox with script.js on about.html
- 12:15 - Added dynamic search bar that filters .searchable content
- 12:30 - Rebuilt enquiry.html with full controls (text, email, select, radio, checkbox, textarea), validation and response message
- 12:45 - Rebuilt contact.html with validation and email processing simulation
- 13:00 - Created comprehensive README.md and detailed CHANGELOG.md
- 13:15 - Added IEEE references
- 13:30 - Deployed to GitHub Pages, tested all pages load without errors
- 13:45 - Made 4 separate descriptive Git commits and pushed