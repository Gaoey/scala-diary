

# Tail Recursion

   Recursion is the way to repeating an action. but it potentially allocates space on the stack for each recursive call.
   In particular, if the function directly returns the result of the recursive call,
   the current stack frame can be reused.
   In other words, instead of calling ourselves recursively and then returning the answer,
   we just jump to the top of the function, eliminating the call and return sequence, as well as the additional stack frame.
   We call it tail recursion
  
   See more
   
   https://homes.cs.washington.edu/~jrw12/tail-mod-cons.html
  
   ### Summary
   Instead return recursive call (Allowcates stack space), tail recursion returning the answer.(Don't keep the stack space)
   In FP we use this instead iteration.
  
  
  ------------
  
  Recursive (ฟังก์ชันเวียนบังเกิด)
  
  คือวิธีการวนซ้ำฟังก์ชั่น แต่ทุกครั้งที่มีการวนฟังก์ชั่นซ้ำ จะมีการเก็บ Memory, 
  วิธีการของ Tail Recursion คือแทนที่จะวนเรียกฟังก์ชั่น เพื่อให้ stack เก็บ Memory ก็ให้คืนคำตอบไปแทน
  จึงไม่เกิดการจอง Memory
  