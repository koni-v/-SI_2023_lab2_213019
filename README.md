Кони Видовиќ, бр. на индекс 213019

Control Flow Graph
![finalnoSI](https://github.com/koni-v/-SI_2023_lab2_213019/assets/125313042/ca6ce9fa-5d69-4106-9395-f4fa77fb152e)


Цикломатска комплексност

Цикломатската комплексност на овој код е 11, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајов P=10, па цикоматската комплексност е 11. Исто така имам 23 јазли, со 32 ребра, па според формулата ребра-јазли+2 --> 32-23+2 = 11.


Тест случаи според критериумот Every branch

За EveryBranch потребни се 5 тест случаи за да се поминат сите патеки:
1) user!=null, email->содржи (@) и (.), не се совпаѓаат username и emails, password->содржи специјални знаци и      е без празни места
2) user=null
3) user.getUserName()==null, username=email, еmail->не содржи (.), password->не е повеќе од 8 карактери
4) password->со празно место
5) user!=null, email->содржи (@) и (.), се совпаѓаат username и emails, password->НЕ содржи специјални знаци       и е без празни места
![SILab excel](https://github.com/koni-v/-SI_2023_lab2_213019/assets/125313042/4bf58bf1-0aa0-4026-a8e4-5800c4183153)


Тест случаи според критериумот Multiple Condition

За Multiple Condition критериумот поттебни се 4 тест случаи за условот: 
if (user==null || user.getPassword()==null || user.getEmail()==null)
1) user==null (T)
2) user.getPassword()==null (T)
3) user.getEmail()==null (T)
4) user!=null, user.getPassword()!=null, user.getEmail()!=null (F)
