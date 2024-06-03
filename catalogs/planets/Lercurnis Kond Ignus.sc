Planet	"Ignus/Lercurnis B V"
{
	ParentBody     "Kond"
	Class          "Ferria"
	Mass            8.7
	Radius          1.15e+04
	InertiaMoment   0.331
	Obliquity       0.1
	EqAscendNode    -68.7
	TidalLocked     true

	AbsMagn         -5.08
	SlopeParam      7.14
	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_ignus.cfg"
		SurfStyle       0.278
		Randomize      (0.443, 0.565, 0.015)
		colorDistMagn   0.0833
		colorDistFreq   1.01e+03
		detailScale     1.83e+08
		drivenDarkening 0
		seaLevel        0.00763
		snowLevel       0.763
		tropicLatitude  0
		icecapLatitude  2
		icecapHeight    0
		climatePole     1
		climateTropic   1
		climateEquator  1
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.353
		heightTempGrad  0.375
		beachWidth      0.000876
		tropicWidth     0.5
		mainFreq        1.34
		venusFreq       1.4
		venusMagn       0.763
		mareFreq        1.19
		mareDensity     0
		terraceProb     0
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0
		dunesFreq       0
		dunesFraction   0
		hillsMagn       10
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      10
		riversFreq      10
		riversSin       8.02
		riftsMagn       100
		riftsFreq       6.95
		riftsSin        7.94
		canyonsMagn     1
		canyonsFreq     25
		canyonsFraction 1
		cracksMagn      0.105
		cracksFreq      1.12
		cracksOctaves   0
		craterMagn      3
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		volcanoMagn     0.435
		volcanoFreq     0.29
		volcanoDensity  1
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   0.29
		volcanoTemp     2.75e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     1.11
		cycloneDensity  0.335
		cycloneOctaves  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.5
		SpotBright      1.46
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	Clouds
	{
		Height          20
		Velocity        203
		BumpHeight      0.622
		Hapke           0.489
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        1.42
		mainOctaves     0
		Coverage        0.641
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          20
		Velocity        203
		BumpHeight      0.854
		Gamma           0.541
		Hapke           0.412
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.641
		mainFreq        1.42
		mainOctaves     0
		Coverage        0.641
		stripeZones     1
		stripeTwist     3.5
	}

	Clouds
	{
		Height          20
		Velocity        203
		BumpHeight      0.453
		Gamma           0.541
		Hapke           0.58
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		Opacity         0.504
		mainFreq        1.42
		mainOctaves     0
		Coverage        0.641
		stripeZones     1
		stripeTwist     3.5
	}

	NoLava          true

	Atmosphere
	{
		Model          "Lercurnis Kond Ignus"
		Height          140
		Density         311
		Pressure        622
		Greenhouse      311
		Bright          20
		Opacity         1
		SkyLight        3.33
		Hue             0
		Saturation      1.6

		Composition
		{
			N2        	44
			H2O       	32.8
			NH3       	9.51
			C2H4      	4.08
			SO2       	3.59
			CO2       	3.11
			C2H2      	1.16
			H2S       	1.09
			C2H6      	0.551
			CH4       	0.0386
			C3H8      	0.0219
			C8H18     	0.00797
			CO        	0.00325
			Ar        	0.000234
			Cl2       	5.8e-05
		}
	}

	Climate
	{
		GlobalWindSpeed  1.48
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0836349064
		Eccentricity    0.0152671756
		Inclination     0.1
		AscendingNode   -68.7022901
		ArgOfPericenter -74.1984733
		MeanAnomaly     79.6946565
	}
}

