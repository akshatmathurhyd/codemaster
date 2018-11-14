#!/usr/bin/python
# -*- coding: utf-8 -*-

class Calculator():
    '''A class to mimic a simple calculator which performs addition,
       subtraction, multiplication, division, and exponentiation.
       Each operation may take one or two arguments-for one argument,
       the operation should be performed on the running total. For two
       arguments, the operation should be performed on the two arguments
       to create a new running total.

       For example, add(2, 5) would produce 7 and if that were followed
       by mult(3), a value of 21 would be returned (= 7 x 3).

       The ac ("all clear") function should set the running total to 0.          
    '''

    def __init__(self):
        '''Initialize running total to 0. We could of course invoke the
           ac() function here, especially if initialization were more
           involved than simply setting the running total to 0.
        '''
        self.total = 0.0

    def ac(self):
        self.total = 0.0

    def add(self, op1, op2 = None):
        '''Add two numbers. If only one number supplied, add to running total.'''
        if op2 is None:
            op2 = self.total
        self.total = op1 + op2
        return self.total
        
    def sub(self, op1, op2 = None):
        '''Subtract two numbers. If only one number supplied, subtract from
           the running total.
        '''
        if op2 == None:
            op2 = self.total
            self.total = op2 - op1
        else:
            self.total = op1 - op2
        return self.total

    def mult(self, op1, op2 = None):
        '''Multiply two numbers. If only one number supplied, multiply
           running total.
        '''
        if op2 is None:
            op2 = self.total
        self.total = op1 * op2
        return self.total

    def pow(self, op1, op2 = None):
        '''Raise a number to a power. If no number supplied, raise the
           running total to the power. 
        '''
        if op2 is None:
            op2 = self.total
            self.total = op2 ** op1
        else:
            self.total = op1 ** op2
        return self.total
        
    def div(self, op1, op2 = None):
        if op2 is None:
            op2 = self.total
        self.total = op1 // op2
        return self.total

