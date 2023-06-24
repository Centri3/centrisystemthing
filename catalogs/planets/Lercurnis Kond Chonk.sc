Planet	"Chonk/Lercurnis B II"
{
	ParentBody     "Kond"
	Class          "Neptune"
	Mass            0.24822
	Radius          7650
	InertiaMoment   0.23577
	Oblateness      0.0032628
	Obliquity       1
	EqAscendNode    84.492
	TidalLocked     true

	AbsMagn         -4.2044
	SlopeParam      5.0526
	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "lercurnis_kond_chonk.cfg"
		SurfStyle       0.3624
		Randomize      (-0.792, 0.152, -0.306)
		detailScale     256
		tropicLatitude  0
		icecapLatitude  0.9
		mareDensity     0
		montesFraction  0
		dunesFraction   0
		hillsFraction   0
		hills2Fraction  0
		canyonsFraction 0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		volcanoTemp     1786.3
		lavaCoverTidal  0
		lavaCoverSun    0.33399
		lavaCoverYoung  0
		stripeZones     1.145
		stripeFluct     0.44275
		stripeTwist     5
		cycloneMagn     2.6179
		cycloneFreq     0.58514
		cycloneDensity  0.40224
		cycloneOctaves  0
		BumpHeight      20
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          0.1001
		Velocity        2557.6
		BumpHeight      1.9072
		Gamma           0.8242
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        1.626
		mainOctaves     15
		Coverage        0.50276
		stripeZones     1.145
		stripeFluct     0.44275
		stripeTwist     5
	}

	Clouds
	{
		Height          0.1001
		Velocity        1205.2
		BumpHeight      1.3872
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.7
		mainFreq        1.626
		mainOctaves     15
		Coverage        0.50276
		stripeZones     1.145
		stripeFluct     0.44275
		stripeTwist     5
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Chonk"
		Height          400
		Density         522.02
		Pressure        1874.9
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0
		Saturation      1

		Composition
		{
			H2O       	90
			N2        	9
			CO2       	1
			O2        	1e-05
		}
	}

	Aurora
	{
		Height         107.66
		NorthLat       60
		NorthLon       0
		NorthRadius    5231.7
		NorthWidth     1440.1
		NorthRings     4
		NorthBright    0.43672
		NorthFlashFreq 7.8186
		NorthMoveSpeed 100
		NorthParticles 100000
		SouthLat       -60
		SouthLon       180
		SouthRadius    5158
		SouthWidth     1535
		SouthRings     4
		SouthBright    0.43672
		SouthFlashFreq 4.6145
		SouthMoveSpeed 100
		SouthParticles 100000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	CometTail
	{
		MaxLength   0.013369
		GasToDust   0.038168
		Particles   10000
		GasBright   0.001
		DustBright  0.001
		GasColor   (0.000 0.011 0.020)
		DustColor  (0.185 0.227 0.191)
	}

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00616944948
		SemiMajorAxis   0.0144942311
		Eccentricity    0.0305343511
		Inclination     1
		AscendingNode   84.49172
		ArgOfPericenter -145.648855
		MeanAnomaly     0
	}
}

