
# An Introduction to Vim

#### Itinerary

1.  [How and why Vim is unique]()
2.  [Basic operations]()
3.  [Basic motions]()
4.  [Operators]()
5.  [Text objects]()
6.  [Combining operators with motions and text objects]()
7.  [The dot operator]()
8.  [Insert mode]()
9.  [Visual mode]()
10. [Command mode]()
11. [Searching (and replacing)]()
12. [Macros]()
13. [Vim's help system]()
14. [Customizing Vim]()
15. [Plugins]()

---

## How and why Vim is unique

* [Vi + Improved = Vim]()
<br>
* [Keyboard layout - the home row ASDF JKL;]()
<br>
* [The ADM-3A](http://xahlee.info/kbd/iold51593/ADM-3A_keyboard_cb140.jpg)
<br>
* [Efficiency of keystrokes]()
<br>
* [Efficiency of motion]()
<br>
* [Vim is ubiquitous, extremely efficient and extremely customizable]()
    <br>
    <br>
    <br>

**:help develop**

---

## Basic operations

* [Starting Vim]()
    + [opening files]()
* [Exiting Vim]()
    <br>
    <br>
    kill -9 $(ps aux | grep vim | tr -s " " | cut -d" " -f2)


---

#### Basic motions

* ```h j k l```        - left, down, up, right
* ```w/W```            - forward one word/WORD
* ```b/B```            - back one word/WORD
* ```e/E```            - to the end of the word/WORD
* ```) (```            - forward/back to next/previous sentence
* ```} {```            - forward/back to next/previous empty line
* ```^ g_```           - to the first/last non-blank character in the line
* ```0 $```            - to the beginning/end of the line
* ```f/F[char]```      - forward/back to next/previous occurance of [char] in current line
* ```t/T[char]```      - forward/back to one character before next/previous occurance of [char] in current line
* ```; ,```            - repeat last f F or t T motion
* ```gg```             - beggining of file
* ```G```              - end of file
* ```%```              - to matching ( { [ <
* ```g; g,```          - move to older/newer position in change list
* ```<C-O>```          - move to older position in jumplist (:help jumplist)
* ```<C-I>```          - move to newer position in jumplist
* ```<C-F>```          - page down (forward)
* ```<C-B>```          - page up (backwards)
* ```<C-D>```          - half a page down (forward)
* ```<C-U>```          - half a page up (backwards)
* ```<C-Y>```          - scroll one line up
* ```<C-E>```          - scroll one line down
<br>
<br>
<br>
**:help motion.txt**
**:help motion**

---

#### Text objects

* ```iw```      inside word
* ```aw```      around word
* ```iW```      inside WORD
* ```aW```      around WORD
* ```ip```      inside paragraph
* ```ap```      around paragraph
* ```i{```      inside  { }
* ```a{```      around  { }
* ```i(```      inside  ( )
* ```a(```      around  ( )
* ```i"```      inside  " "
* ```a"```      around  " "
* ```it```      inside HTML tag
* ```at```      around HTML tag
<br>
<br>
<br>
**:help text-objects**
**:help iskeyword**

---

#### Operator + motion/text-object

   +   __delete__   (d)
   +   __change__   (c)
   +   __yank__     (y)
   +   __indent__   (>)
   +   __outdent__  (<)
   +   __TOUPPER__  (gU)
   +   __tolower__  (gu)
   +   __run shell command__  (!)

* ```diw```     delete inside word
* ```daw```     delete around word
* ```diW```     delete inside WORD
* ```daW```     delete around WORD
* ```cip```     change inside paragraph
* ```cap```     change around paragraph
* ```yi{```     yank inside  { }
* ```ya{```     yank around  { }
* ```gUi"```    make everything in double quotes UPPERCASE
* ```>ip```     indent inside paragraph
<br>
<br>
> Operations and motions can be prepended with a count!
> <br>
> <br>
> * ```5dw```  delete 5 words
> * ```12j```  go down 12 lines
> * ```3$```   go to the end of 3 lines, including the current one
   <br>

**:help operator**

---

# The dot operator

* Repeats the last operation.
<br>
* ```dd...```    - deletes 4 lines
* ```Ctrl-a..``` - increments closest number by 3

---

#### Insert mode

* ```i``` - enter insert mode at cursor
* ```I``` - enter insert mode at first non-blank character
* ```s``` - delete character under cursor and enter insert mode
* ```S``` - delete whole line and start insert mode at the beginning of same line
* ```a``` - move right one character and enter insert mode
* ```A``` - move to the end of the line and enter insert mode
* ```o``` - create new empty line under current line and enter insert mode
* ```O``` - create new empty line above current line and enter insert mode
* ```C``` - delete from the cursor to the end of the line and enter insert mode
* ```C-R x``` - insert the contents of register x
<br>
<br>
<br>
>To return to Normal mode, hit the Escape key.

---

#### Dealing with ESC

* [Just use ESC]()
* Use Ctrl-[
* [Remap CAPS-LOCK to ESC]()
    + [AutoHotKey]()
    + [Dual Key Remap](https://github.com/ililim/dual-key-remap)
* [:noremap jk   or jj or fj or jf ...]()
* [Vim Clutch](https://boingboing.net/2018/03/12/the-vim-clutch-a-footpeda.html)

---

#### Visual mode

* ```v```      - enter visual mode
* ```V```      - enter linewise visual mode
* ```Ctrl-v``` - enter block visual mode

---

#### Command line mode

Enter command mode by typing : (colon)

---

#### Searching

Enter search mode by typing / (forward slash)

<br>

#### Replacing

**:%s/before/after/g**

**:3,15s/before/after/g**

**:%s//replacepreviousearch/g**

**:g/TODO/s/-/:/g**

**:g/TODO/s//WONTFIX/g**

**:set gdefault**

---

#### Learning Vim

* [Vimtutor]()
<br>
* [What do you do very often? Map it!]()
<br>
* [Cheatsheet (5 - 10 new things a week)]()
<br>
* [:help user-manual]()
<br>
* [:help quickref]()
<br>
* [Drew Neil "Practical Vim" & vimcast.org]()
