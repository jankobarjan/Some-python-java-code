import socket
import logging

__author__ = "kobarjan"

def socketSetup(port):
    s = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
    try:
        s.bind(("localhost", port))
    except socket.error as err:
        print ("Bind failed. Error Code: " .format(err))
    if(s is None):
        logging.warn("Socket not created!")
    logging.info("Socket created succesfully.")
    print("Socket created succesfully.")
    s.listen(5)
    while True:
        print("Started waiting for client.")
        run = True
        c, addr = s.accept()
        logging.info("Got connection from")
        print("Got connection from: " + str(addr))
        while run == True:
            answer = c.recv(1024)
            if (answer == ""):
                logging.warn("Answer not recieved")
            elif (answer == "cpu"):
                logging.info("Getting cpu stats")
