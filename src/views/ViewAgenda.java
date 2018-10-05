package views;


public class ViewAgenda extends javax.swing.JFrame {

    
    public ViewAgenda() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_nombre = new javax.swing.JLabel();
        jl_email = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jtf_email = new javax.swing.JTextField();
        jbtn_primero = new javax.swing.JButton();
        jbtn_anterior = new javax.swing.JButton();
        jbtn_siguiente = new javax.swing.JButton();
        jbtn_ultimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jl_nombre.setText("Nombre");

        jl_email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jl_email.setText("Email");

        jbtn_primero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtn_primero.setText("|<");

        jbtn_anterior.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtn_anterior.setText("<<");

        jbtn_siguiente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtn_siguiente.setText(">>");

        jbtn_ultimo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtn_ultimo.setText(">|");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn_primero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn_anterior)
                        .addGap(22, 22, 22)
                        .addComponent(jbtn_siguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn_ultimo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_nombre)
                            .addComponent(jl_email))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_nombre)
                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_email)
                    .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_primero)
                    .addComponent(jbtn_anterior)
                    .addComponent(jbtn_siguiente)
                    .addComponent(jbtn_ultimo))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtn_anterior;
    public javax.swing.JButton jbtn_primero;
    public javax.swing.JButton jbtn_siguiente;
    public javax.swing.JButton jbtn_ultimo;
    public javax.swing.JLabel jl_email;
    public javax.swing.JLabel jl_nombre;
    public javax.swing.JTextField jtf_email;
    public javax.swing.JTextField jtf_nombre;
    // End of variables declaration//GEN-END:variables
}
