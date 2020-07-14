let SessionLoad = 1
let s:so_save = &so | let s:siso_save = &siso | set so=0 siso=0
let v:this_session=expand("<sfile>:p")
silent only
cd ~/Universidad/diseño_construcción_de_componentes/exams/Examen2
if expand('%') == '' && !&modified && line('$') <= 1 && getline(1) == ''
  let s:wipebuf = bufnr('%')
endif
set shortmess=aoO
badd +32 src/main/java/com/ssoto/examen2/web/ActorController.java
badd +4 src/main/resources/templates/actor.html
badd +43 src/main/java/com/ssoto/examen2/domain/Actor.java
badd +1 src/main/resources/templates/reg_actor.html
badd +11 ~/.cache/bujo/Examen2/todo.md
badd +1 src/main/resources/templates/reg_guionista.html
badd +1 src/main/resources/templates/guionista.html
badd +1 src/main/java/com/ssoto/examen2/web/GuionistaController.java
badd +0 src/main/java/com/ssoto/examen2/domain/Guionista.java
argglobal
%argdel
set stal=2
edit src/main/resources/templates/reg_actor.html
set splitbelow splitright
wincmd _ | wincmd |
vsplit
1wincmd h
wincmd _ | wincmd |
split
1wincmd k
wincmd w
wincmd w
wincmd _ | wincmd |
split
1wincmd k
wincmd w
set nosplitbelow
set nosplitright
wincmd t
set winminheight=0
set winheight=1
set winminwidth=0
set winwidth=1
exe '1resize ' . ((&lines * 20 + 23) / 46)
exe 'vert 1resize ' . ((&columns * 88 + 88) / 177)
exe '2resize ' . ((&lines * 21 + 23) / 46)
exe 'vert 2resize ' . ((&columns * 88 + 88) / 177)
exe '3resize ' . ((&lines * 20 + 23) / 46)
exe 'vert 3resize ' . ((&columns * 88 + 88) / 177)
exe '4resize ' . ((&lines * 21 + 23) / 46)
exe 'vert 4resize ' . ((&columns * 88 + 88) / 177)
argglobal
setlocal fdm=syntax
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal nofen
let s:l = 3 - ((2 * winheight(0) + 10) / 20)
if s:l < 1 | let s:l = 1 | endif
exe s:l
normal! zt
3
normal! 0
wincmd w
argglobal
if bufexists("src/main/resources/templates/actor.html") | buffer src/main/resources/templates/actor.html | else | edit src/main/resources/templates/actor.html | endif
setlocal fdm=syntax
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal nofen
let s:l = 39 - ((0 * winheight(0) + 10) / 21)
if s:l < 1 | let s:l = 1 | endif
exe s:l
normal! zt
39
normal! 048|
wincmd w
argglobal
if bufexists("src/main/java/com/ssoto/examen2/domain/Actor.java") | buffer src/main/java/com/ssoto/examen2/domain/Actor.java | else | edit src/main/java/com/ssoto/examen2/domain/Actor.java | endif
setlocal fdm=syntax
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal nofen
let s:l = 43 - ((0 * winheight(0) + 10) / 20)
if s:l < 1 | let s:l = 1 | endif
exe s:l
normal! zt
43
normal! 0
wincmd w
argglobal
if bufexists("src/main/java/com/ssoto/examen2/web/ActorController.java") | buffer src/main/java/com/ssoto/examen2/web/ActorController.java | else | edit src/main/java/com/ssoto/examen2/web/ActorController.java | endif
setlocal fdm=syntax
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal nofen
let s:l = 33 - ((0 * winheight(0) + 10) / 21)
if s:l < 1 | let s:l = 1 | endif
exe s:l
normal! zt
33
normal! 020|
wincmd w
exe '1resize ' . ((&lines * 20 + 23) / 46)
exe 'vert 1resize ' . ((&columns * 88 + 88) / 177)
exe '2resize ' . ((&lines * 21 + 23) / 46)
exe 'vert 2resize ' . ((&columns * 88 + 88) / 177)
exe '3resize ' . ((&lines * 20 + 23) / 46)
exe 'vert 3resize ' . ((&columns * 88 + 88) / 177)
exe '4resize ' . ((&lines * 21 + 23) / 46)
exe 'vert 4resize ' . ((&columns * 88 + 88) / 177)
tabedit src/main/resources/templates/reg_guionista.html
set splitbelow splitright
wincmd _ | wincmd |
vsplit
1wincmd h
wincmd _ | wincmd |
split
1wincmd k
wincmd w
wincmd w
wincmd _ | wincmd |
split
1wincmd k
wincmd w
set nosplitbelow
set nosplitright
wincmd t
set winminheight=0
set winheight=1
set winminwidth=0
set winwidth=1
exe '1resize ' . ((&lines * 21 + 23) / 46)
exe 'vert 1resize ' . ((&columns * 88 + 88) / 177)
exe '2resize ' . ((&lines * 20 + 23) / 46)
exe 'vert 2resize ' . ((&columns * 88 + 88) / 177)
exe '3resize ' . ((&lines * 21 + 23) / 46)
exe 'vert 3resize ' . ((&columns * 88 + 88) / 177)
exe '4resize ' . ((&lines * 20 + 23) / 46)
exe 'vert 4resize ' . ((&columns * 88 + 88) / 177)
argglobal
setlocal fdm=syntax
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal nofen
let s:l = 1 - ((0 * winheight(0) + 10) / 21)
if s:l < 1 | let s:l = 1 | endif
exe s:l
normal! zt
1
normal! 0
wincmd w
argglobal
if bufexists("src/main/resources/templates/guionista.html") | buffer src/main/resources/templates/guionista.html | else | edit src/main/resources/templates/guionista.html | endif
setlocal fdm=syntax
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal nofen
let s:l = 1 - ((0 * winheight(0) + 10) / 20)
if s:l < 1 | let s:l = 1 | endif
exe s:l
normal! zt
1
normal! 0
lcd ~/Universidad/diseño_construcción_de_componentes/exams/Examen2
wincmd w
argglobal
if bufexists("~/Universidad/diseño_construcción_de_componentes/exams/Examen2/src/main/java/com/ssoto/examen2/domain/Guionista.java") | buffer ~/Universidad/diseño_construcción_de_componentes/exams/Examen2/src/main/java/com/ssoto/examen2/domain/Guionista.java | else | edit ~/Universidad/diseño_construcción_de_componentes/exams/Examen2/src/main/java/com/ssoto/examen2/domain/Guionista.java | endif
setlocal fdm=syntax
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal nofen
let s:l = 1 - ((0 * winheight(0) + 10) / 21)
if s:l < 1 | let s:l = 1 | endif
exe s:l
normal! zt
1
normal! 0
wincmd w
argglobal
if bufexists("~/Universidad/diseño_construcción_de_componentes/exams/Examen2/src/main/java/com/ssoto/examen2/web/GuionistaController.java") | buffer ~/Universidad/diseño_construcción_de_componentes/exams/Examen2/src/main/java/com/ssoto/examen2/web/GuionistaController.java | else | edit ~/Universidad/diseño_construcción_de_componentes/exams/Examen2/src/main/java/com/ssoto/examen2/web/GuionistaController.java | endif
setlocal fdm=syntax
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal nofen
let s:l = 1 - ((0 * winheight(0) + 10) / 20)
if s:l < 1 | let s:l = 1 | endif
exe s:l
normal! zt
1
normal! 0
lcd ~/Universidad/diseño_construcción_de_componentes/exams/Examen2
wincmd w
3wincmd w
exe '1resize ' . ((&lines * 21 + 23) / 46)
exe 'vert 1resize ' . ((&columns * 88 + 88) / 177)
exe '2resize ' . ((&lines * 20 + 23) / 46)
exe 'vert 2resize ' . ((&columns * 88 + 88) / 177)
exe '3resize ' . ((&lines * 21 + 23) / 46)
exe 'vert 3resize ' . ((&columns * 88 + 88) / 177)
exe '4resize ' . ((&lines * 20 + 23) / 46)
exe 'vert 4resize ' . ((&columns * 88 + 88) / 177)
tabnext 2
set stal=1
if exists('s:wipebuf') && getbufvar(s:wipebuf, '&buftype') isnot# 'terminal'
  silent exe 'bwipe ' . s:wipebuf
endif
unlet! s:wipebuf
set winheight=1 winwidth=20 winminheight=1 winminwidth=1 shortmess=filnxtToOFc
let s:sx = expand("<sfile>:p:r")."x.vim"
if file_readable(s:sx)
  exe "source " . fnameescape(s:sx)
endif
let &so = s:so_save | let &siso = s:siso_save
doautoall SessionLoadPost
unlet SessionLoad
" vim: set ft=vim :
