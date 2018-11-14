#!/usr/bin/python
# -*- coding: utf-8 -*-

from calculator import Calculator
import unittest
from inspect import isclass

class TestCalculator(unittest.TestCase):
    '''A class to test our simple calculator.'''

    def setUp(self):
        '''Create a calculator to use for testing.'''
        self.calc = Calculator()
        
    def test_pow(self):
        '''Test raising a number to a power.'''
        self.assertEqual(self.calc.pow(2, 3), 8)

    def test_add(self):
        '''Test adding 2 numbers.'''
        self.assertEqual(self.calc.add(2,2), 4)

    def test_sub(self):
        '''Test substracting 2 numbers.'''
        self.assertEqual(self.calc.sub(2,2), 0)

    def test_mult(self):
        '''Test multiplying 2 numbers.'''
        self.assertEqual(self.calc.mult(2,3), 6)

    def divByZero(self):
    	pass

unittest.main()
 

