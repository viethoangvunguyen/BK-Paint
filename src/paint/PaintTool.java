/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author hung
 */
public class PaintTool extends javax.swing.JPanel implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static enum DrawMode{LINE,RECT,OVAL,PENCIL,ERASER,CURVE,POLYGON,TRIANGLE,BUCKET,PICKER,TEXT,ROUNDRECT,RIGHTTRIANGLE, ZOOM,SEL}
    private DrawMode drawMode = DrawMode.PENCIL;
    
    /**
     * Creates new form PaintTool
     */
    public PaintTool() {
        initComponents();
        bPencil.setIcon(new ImageIcon(getImageIcon("/icon/pen.png")));
        bBucket.setIcon(new ImageIcon(getImageIcon("/icon/bucket.png")));
        bCurve.setIcon(new ImageIcon(getImageIcon("/icon/curve.png")));
        bEraser.setIcon(new ImageIcon(getImageIcon("/icon/eraser.png")));
        bOval.setIcon(new ImageIcon(getImageIcon("/icon/oval.png")));
        bFont.setIcon(new ImageIcon(getImageIcon("/icon/font.png")));
        bLine.setIcon(new ImageIcon(getImageIcon("/icon/line.png")));
        bPicker.setIcon(new ImageIcon(getImageIcon("/icon/picker.png")));
        bPolygon.setIcon(new ImageIcon(getImageIcon("/icon/polygon.png")));
        bRect.setIcon(new ImageIcon(getImageIcon("/icon/rect.png")));
        bRoundRect.setIcon(new ImageIcon(getImageIcon("/icon/roundRect.png")));
        bTriangle.setIcon(new ImageIcon(getImageIcon("/icon/triangle.png")));
        bSquareTriangle.setIcon(new ImageIcon(getImageIcon("/icon/sqtriangle.png")));
        bZoom.setIcon(new ImageIcon(getImageIcon("/icon/zoom.png")));
        select.setIcon(new ImageIcon(getImageIcon("/icon/selrect.png")));
    }

    public Image getImageIcon(String path){
        Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource(path));
        return image;
    }
    public DrawMode getDrawMode(){
        return drawMode;
    }
    public void setDrawMode(DrawMode newDrawMode){
        DrawMode oldDrawMode = this.drawMode;
        this.drawMode = newDrawMode;
        this.firePropertyChange("tool change", oldDrawMode, newDrawMode);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bPencil = new javax.swing.JToggleButton();
        bBucket = new javax.swing.JToggleButton();
        bFont = new javax.swing.JToggleButton();
        bLine = new javax.swing.JToggleButton();
        bRect = new javax.swing.JToggleButton();
        bOval = new javax.swing.JToggleButton();
        bCurve = new javax.swing.JToggleButton();
        bEraser = new javax.swing.JToggleButton();
        bPicker = new javax.swing.JToggleButton();
        bZoom = new javax.swing.JToggleButton();
        bPolygon = new javax.swing.JToggleButton();
        bRoundRect = new javax.swing.JToggleButton();
        bSquareTriangle = new javax.swing.JToggleButton();
        bTriangle = new javax.swing.JToggleButton();
        select = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(233, 247, 247));

        bPencil.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bPencil);
        bPencil.setSelected(true);
        bPencil.setPreferredSize(new java.awt.Dimension(40, 40));
        bPencil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPencilActionPerformed(evt);
            }
        });

        bBucket.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bBucket);
        bBucket.setPreferredSize(new java.awt.Dimension(40, 40));
        bBucket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBucketActionPerformed(evt);
            }
        });

        bFont.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bFont);
        bFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/font.png"))); // NOI18N
        bFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFontActionPerformed(evt);
            }
        });

        bLine.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bLine);
        bLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/line.png"))); // NOI18N
        bLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLineActionPerformed(evt);
            }
        });

        bRect.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bRect);
        bRect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rect.png"))); // NOI18N
        bRect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRectActionPerformed(evt);
            }
        });

        bOval.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bOval);
        bOval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/oval.png"))); // NOI18N
        bOval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOvalActionPerformed(evt);
            }
        });

        bCurve.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bCurve);
        bCurve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/curve.png"))); // NOI18N
        bCurve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCurveActionPerformed(evt);
            }
        });

        bEraser.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bEraser);
        bEraser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eraser.png"))); // NOI18N
        bEraser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEraserActionPerformed(evt);
            }
        });

        bPicker.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bPicker);
        bPicker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/picker.png"))); // NOI18N
        bPicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPickerActionPerformed(evt);
            }
        });

        bZoom.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bZoom);
        bZoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/zoom.png"))); // NOI18N
        bZoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bZoomActionPerformed(evt);
            }
        });

        bPolygon.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bPolygon);
        bPolygon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/polygon.png"))); // NOI18N
        bPolygon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPolygonActionPerformed(evt);
            }
        });

        bRoundRect.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bRoundRect);
        bRoundRect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/roundRect.png"))); // NOI18N
        bRoundRect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRoundRectActionPerformed(evt);
            }
        });

        bSquareTriangle.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bSquareTriangle);
        bSquareTriangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sqtriangle.png"))); // NOI18N
        bSquareTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSquareTriangleActionPerformed(evt);
            }
        });

        bTriangle.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(bTriangle);
        bTriangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/triangle.png"))); // NOI18N
        bTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTriangleActionPerformed(evt);
            }
        });

        buttonGroup1.add(select);
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bEraser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(bPencil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bBucket, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(bFont, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(bLine, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(bRect, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(bOval, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(bCurve, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(bZoom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(bPolygon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(bRoundRect, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(bSquareTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(bTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(5, 5, 5)
                .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(select, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bPencil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBucket, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bFont, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bLine, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bRect, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bOval, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCurve, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bEraser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bZoom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPolygon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bRoundRect, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bSquareTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bOvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOvalActionPerformed
        setDrawMode(DrawMode.OVAL);
    }//GEN-LAST:event_bOvalActionPerformed

    private void bFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFontActionPerformed
        setDrawMode(DrawMode.TEXT);
    }//GEN-LAST:event_bFontActionPerformed

    private void bCurveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCurveActionPerformed
        setDrawMode(DrawMode.CURVE);
    }//GEN-LAST:event_bCurveActionPerformed

    private void bPencilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPencilActionPerformed
        setDrawMode(DrawMode.PENCIL);
    }//GEN-LAST:event_bPencilActionPerformed

    private void bLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLineActionPerformed
        setDrawMode(DrawMode.LINE);
    }//GEN-LAST:event_bLineActionPerformed

    private void bRectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRectActionPerformed
        setDrawMode(DrawMode.RECT);
    }//GEN-LAST:event_bRectActionPerformed

    private void bBucketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBucketActionPerformed
        setDrawMode(DrawMode.BUCKET);
    }//GEN-LAST:event_bBucketActionPerformed

    private void bEraserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEraserActionPerformed
       setDrawMode(DrawMode.ERASER);
    }//GEN-LAST:event_bEraserActionPerformed

    private void bPickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPickerActionPerformed
        setDrawMode(DrawMode.PICKER);
    }//GEN-LAST:event_bPickerActionPerformed

    private void bZoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bZoomActionPerformed
        setDrawMode(DrawMode.ZOOM);
    }//GEN-LAST:event_bZoomActionPerformed

    private void bPolygonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPolygonActionPerformed
        setDrawMode(DrawMode.POLYGON);
    }//GEN-LAST:event_bPolygonActionPerformed

    private void bRoundRectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRoundRectActionPerformed
        setDrawMode(DrawMode.ROUNDRECT);
    }//GEN-LAST:event_bRoundRectActionPerformed

    private void bSquareTriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSquareTriangleActionPerformed
        setDrawMode(DrawMode.RIGHTTRIANGLE);
    }//GEN-LAST:event_bSquareTriangleActionPerformed

    private void bTriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTriangleActionPerformed
       setDrawMode(DrawMode.TRIANGLE);
    }//GEN-LAST:event_bTriangleActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        setDrawMode(DrawMode.SEL);
    }//GEN-LAST:event_selectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bBucket;
    private javax.swing.JToggleButton bCurve;
    private javax.swing.JToggleButton bEraser;
    private javax.swing.JToggleButton bFont;
    private javax.swing.JToggleButton bLine;
    private javax.swing.JToggleButton bOval;
    private javax.swing.JToggleButton bPencil;
    private javax.swing.JToggleButton bPicker;
    private javax.swing.JToggleButton bPolygon;
    private javax.swing.JToggleButton bRect;
    private javax.swing.JToggleButton bRoundRect;
    private javax.swing.JToggleButton bSquareTriangle;
    private javax.swing.JToggleButton bTriangle;
    private javax.swing.JToggleButton bZoom;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton select;
    // End of variables declaration//GEN-END:variables
}
