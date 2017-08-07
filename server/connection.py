import socket

def socketSetup(port):
    s = socket()
    s.bind(port)