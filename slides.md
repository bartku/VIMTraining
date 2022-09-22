# Itinerary

   1. How and why Vim is unique
   1. Basic motions
   1. Operators
   1. Text objects
   1. Combining operators with motions and text objects


---

# How and why Vim is unique

  1. [ADM-3A](https://en.wikipedia.org/wiki/ADM-3A)
  1. Keyboard layout - the home row ASDF JKL;
  1. Dealing with ESC


---

# Basic motions


1. h j k l    left, down, up, right
1. w/W        forward one word/WORD
1. b/B        back one word/WORD
1. }          forward to next empty line
1. {          back to previous empty line
1. (          back to previous sentence
1. )          forward to next sentence
1. ^          to the beggining of the line
1. $          to the end of the line
1. f[char]    forward to first occurance of [char] in current line
1. t[char]    forward to one character before first occurance of [char] in current line
1. F[char]    back to first previous occurance of [char] in current line
1. T[char]    back to one character before first previous occurance of [char] in current line
1. ; ,        repeat last f F or t T motion
1. gg         beggining of file
1. G          end of file
1. %          to matching ( { [ <

---

# Text objects

1. iw  inside word
1. aw  around word
1. iW  inside WORD
1. aW  around WORD
1. ip  inside paragraph
1. ap  around paragraph
1. i{  inside  { }
1. a{  around  { }
1. i(  inside  ( )
1. a(  around  ( )
1. i"  inside  " "
1. a"  around  " "
1. it  inside  <tag/>
1. at  around  <tag/>
1. :help text-objects   :help motion.txt
