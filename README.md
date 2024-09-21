1. there're a few objects in the question: kangaroo, point, grid, die, so I design 4 classes for all of them. 
2. Among these classes, kangaroo need to depend on other classes: grid, point, die, which is unavoidable.
3. Because the dimension of grid is variable, in my design, kangaroo is not depent on the grid directly. Kangaroo is depent on the grid throught the parameter of function.
   ![image](https://github.com/user-attachments/assets/5bda83cc-7246-485e-8c42-ce179d49c834)
