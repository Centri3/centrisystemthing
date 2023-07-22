Planet	"Don/Lercurnis II"
{
	ParentBody     "Fragmunt-Kond bar"
	Class          "Jupiter"
	Mass            9.554
	Radius          18358
	InertiaMoment   0.23877
	RotationPeriod  67.534
	RotationEpoch   1451545
	Obliquity       156.64
	EqAscendNode    -61.926

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1.5
	BrightnessReal  1.5

	Surface
	{
		Preset         "lercurnis_don.cfg"
		SurfStyle       0.062622
		Randomize      (-0.840, 0.838, 0.490)
		detailScale     256
		tropicLatitude  0.36636
		icecapLatitude  1
		mareDensity     0
		montesFraction  0
		dunesFraction   0
		hillsFraction   0
		hills2Fraction  0
		canyonsFraction 0
		craterDensity   0
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.2214
		stripeFluct     0.44275
		stripeTwist     2
		cycloneMagn     2.6878
		cycloneFreq     0.79721
		cycloneDensity  0.34988
		cycloneOctaves  0
		BumpHeight      18.644
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0
		SpotBright      0
		SpotWidth       0.05
		DayAmbient      0.07
		RingsWinter     0.99893
		ModulateBright  0
	}

	NoOcean         true

	Clouds
	{
		Height          0.099609
		Velocity        -1878.9
		BumpHeight      5.6139
		Gamma           0.66746
		Hapke           0.48855
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     1
		ModulateBright  1.3
		Opacity         0.42748
		mainFreq        3
		mainOctaves     15
		Coverage        0.29008
		stripeZones     1.2214
		stripeFluct     0.44275
		stripeTwist     2
	}

	Clouds
	{
		Height          0.099609
		Velocity        1782.1
		BumpHeight      5.6138
		Gamma           0.66746
		Hapke           0.38168
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.99893
		ModulateBright  1.3
		mainFreq        3
		mainOctaves     15
		Coverage        0.29008
		stripeZones     1.2214
		stripeFluct     0.44275
		stripeTwist     2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Don"
		Height          450
		Density         2718.3
		Pressure        83798
		Bright          3
		Opacity         1
		SkyLight        1
		Hue             0
		Saturation      1

		Composition
		{
			H2        	92.683
			He        	6.9463
			CH4       	0.30155
			N2        	0.031152
			NH3       	0.023767
			O2        	0.0071862
			C2H2      	0.0030806
			C2H4      	0.0012716
			Ne        	0.0010692
			Ar        	0.00077022
			C2H6      	0.00049477
			C3H8      	0.0003275
			C8H18     	0.00026035
			H2O       	2.6514e-06
			H2S       	1.5778e-06
			CO2       	1.5164e-06
			Kr        	4.1168e-07
			Xe        	3.3455e-08
			SO2       	8.6419e-09
			CO        	3.3732e-10
			Cl2       	2.6386e-10
		}
	}

	Aurora
	{
		Height         400
		NorthLat       90
		NorthLon       0
		NorthRadius    10788
		NorthWidth     1639.2
		NorthRings     4
		NorthBright    1
		NorthFlashFreq 70.546
		NorthMoveSpeed 1.1709
		NorthParticles 100000
		SouthLat       -90
		SouthLon       0
		SouthRadius    10788
		SouthWidth     1639.2
		SouthRings     4
		SouthBright    1
		SouthFlashFreq 59.25
		SouthMoveSpeed 1.3855
		SouthParticles 100000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          368.534705
		SemiMajorAxis   47.8120182
		Eccentricity    0.0610687023
		Inclination     -2
		AscendingNode   -13.740458
		ArgOfPericenter -173.129771
		MeanAnomaly     -211.603053
	}
}

