import socket
import logging

def socketSetup(port):
    s = socket()
    s.bind(port)
    #if(s is None):
     #   logging.warn("Socket not created!")
    logging.info("Socket created succesfully.")
    s.accept()